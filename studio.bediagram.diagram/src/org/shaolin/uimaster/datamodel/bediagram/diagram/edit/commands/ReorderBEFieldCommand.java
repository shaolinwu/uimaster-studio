package org.shaolin.uimaster.datamodel.bediagram.diagram.edit.commands;

import org.eclipse.gef.commands.Command;
import org.shaolin.uimaster.datamodel.bediagram.BusinessEntityType;
import org.shaolin.uimaster.datamodel.bediagram.MemberType;

public class ReorderBEFieldCommand extends Command {

	private BusinessEntityType container;

	private MemberType field;

	public ReorderBEFieldCommand() {
	}

	public void setContainer(BusinessEntityType container) {
		this.container = container;
	}

	public void setField(MemberType field) {
		this.field = field;
	}

//	public void setAfterNote(Note afterNote) {
//		index = container.getNotes().indexOf(afterNote) + 1;
//	}
//
//	public void execute() {
//		oldIndex = container.getNotes().indexOf(note);
//		container.removeNote(note);
//		container.addNote(index <= oldIndex ? index : index - 1, note);
//	}
//
//	public void undo() {
//		container.removeNote(note);
//		container.addNote(oldIndex <= index ? oldIndex : oldIndex - 1, note);
//	}
}
