package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.policies;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transposer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.OrderedLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.AddCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.RepositionEObjectCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands.CompartmentRepositionEObjectCommand;

public class FieldCompartmentEditPolicy extends OrderedLayoutEditPolicy {

	private EStructuralFeature feature = null;

	private Polyline insertionLine;
	
	/**
	 * @param feature
	 *            has to be an EList
	 */
	public FieldCompartmentEditPolicy(EStructuralFeature feature) {
		super();
		this.feature = feature;
	}

	@Override
	protected Command createAddCommand(EditPart child, EditPart after) {
		int index = getHost().getChildren().indexOf(after);
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		AddCommand command = new AddCommand(editingDomain, new EObjectAdapter(
				(View) getHost().getModel()), new EObjectAdapter(
				(View) child.getModel()), index);
		return new ICommandProxy(command);
	}

	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (result == null) {
			result = new NonResizableEditPolicy();
		}
		return result;
	}

	@Override
	protected Command createMoveChildCommand(EditPart child, EditPart after) {
		int newIndex;
		int displacement;

		// TODO: needs to be improved.
		int childIndex = getHost().getChildren().indexOf(child);
		int afterIndex = getHost().getChildren().indexOf(after);

		if (afterIndex == -1) {
			newIndex = getHost().getChildren().size() - 1;
			displacement = newIndex - childIndex;
		} else {
			newIndex = afterIndex;
			displacement = afterIndex - childIndex;
			if (childIndex <= afterIndex) {
				newIndex--;
				displacement--;
			}
		}

		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();

		RepositionEObjectCommand command = new CompartmentRepositionEObjectCommand(
				child, editingDomain, "", (EList) ((View) child.getParent()
						.getModel()).getElement().eGet(feature),
				((View) child.getModel()).getElement(), displacement, newIndex) {

			public CommandResult doExecuteWithResult(
					IProgressMonitor progressMonitor, IAdaptable info)
					throws ExecutionException {
				// remove target feedback after dropping
				eraseLayoutTargetFeedback(null);
				return super.doExecuteWithResult(progressMonitor, info);
			}
		};

		return new ICommandProxy(command);
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}
	
	protected boolean isLayoutHorizontal() {
		return true;
	}
	
	/**
	 * @see LayoutEditPolicy#eraseLayoutTargetFeedback(Request)
	 */
	protected void eraseLayoutTargetFeedback(Request request) {
		if (insertionLine != null) {
			removeFeedback(insertionLine);
			insertionLine = null;
		}
	}
	
	/**
	 * Lazily creates and returns a <code>Polyline</code> Figure for use as
	 * feedback.
	 * 
	 * @return a Polyline figure
	 */
	protected Polyline getLineFeedback() {
		if (insertionLine == null) {
			insertionLine = new Polyline();
			insertionLine.setLineWidth(2);
			insertionLine.addPoint(new Point(0, 0));
			insertionLine.addPoint(new Point(10, 10));
			addFeedback(insertionLine);
		}
		return insertionLine;
	}

	private Rectangle getAbsoluteBounds(GraphicalEditPart ep) {
		Rectangle bounds = ep.getFigure().getBounds().getCopy();
		ep.getFigure().translateToAbsolute(bounds);
		return bounds;
	}

	private Point getLocationFromRequest(Request request) {
		return ((DropRequest) request).getLocation();
	}
	
	/**
	 * @param request
	 *            the Request
	 * @return the index for the insertion reference
	 */
	protected int getFeedbackIndexFor(Request request) {
		List children = getHost().getChildren();
		if (children.isEmpty())
			return -1;

		Transposer transposer = new Transposer();
		transposer.setEnabled(!isLayoutHorizontal());

		Point p = transposer.t(getLocationFromRequest(request));
		if (children.size() == 0 || children.size() == 1) {
			return -1;
		}
		int[] y = new int[children.size()];
		for (int i = 0; i < children.size(); i++) {
			EditPart child = (EditPart) children.get(i);
			Rectangle rect = transposer
					.t(getAbsoluteBounds(((GraphicalEditPart) child)));
			y[i] = rect.y;
		}
		int height = 5;
		if (y[0] + height >= p.y) {
			//add to first item;
			return 0;
		} 
		if (y[y.length-1] - height <= p.y) {
			//add to end item;
			return y.length-1;
		} 
		
		int candidateIndex = -1;
		for (int i=0; i<y.length; i++) {
			if (i+1 == y.length) {
				break;
			}
			if (p.y >= y[i] && p.y <= y[i+1]) {
				candidateIndex = i;
				break;
			}
		}
		
		return candidateIndex;
	}

	/**
	 * @see OrderedLayoutEditPolicy#getInsertionReference(Request)
	 */
	protected EditPart getInsertionReference(Request request) {
		List children = getHost().getChildren();

		if (request.getType().equals(RequestConstants.REQ_CREATE)) {
			int i = getFeedbackIndexFor(request);
			if (i == -1)
				return null;
			return (EditPart) children.get(i);
		}

		int index = getFeedbackIndexFor(request);
		if (index != -1) {
			List selection = getHost().getViewer().getSelectedEditParts();
			do {
				EditPart editpart = (EditPart) children.get(index);
				if (!selection.contains(editpart))
					return editpart;
			} while (++index < children.size());
		}
		return null; // Not found, add at the end.
	}
	
	/**
	 * Shows an insertion line if there is one or more current children.
	 * 
	 * @see LayoutEditPolicy#showLayoutTargetFeedback(Request)
	 */
	protected void showLayoutTargetFeedback(Request request) {
		if (getHost().getChildren().size() == 0)
			return;
		Polyline fb = getLineFeedback();
		Transposer transposer = new Transposer();
		transposer.setEnabled(!isLayoutHorizontal());

		int epIndex = getFeedbackIndexFor(request);
		Rectangle r = null;
		if (epIndex == -1) {
			epIndex = getHost().getChildren().size() - 1;
			EditPart editPart = (EditPart) getHost().getChildren().get(epIndex);
			r = transposer.t(getAbsoluteBounds((GraphicalEditPart) editPart));
		} else {
			EditPart editPart = (EditPart) getHost().getChildren().get(epIndex);
			r = transposer.t(getAbsoluteBounds((GraphicalEditPart) editPart));
			Point p = transposer.t(getLocationFromRequest(request));
			if (p.x > r.x + (r.width / 2)){
				editPart = (EditPart) getHost().getChildren().get(epIndex);
				r = transposer
						.t(getAbsoluteBounds((GraphicalEditPart) editPart));
			}
		}
		int x = r.x;
		Point p1 = new Point(x, r.y - 4);
		p1 = transposer.t(p1);
		fb.translateToRelative(p1);
		Point p2 = new Point(x, r.y + r.height + 4);
		p2 = transposer.t(p2);
		fb.translateToRelative(p2);
		fb.setPoint(p1, 0);
		fb.setPoint(p2, 1);
	}

}
