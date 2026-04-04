package org.bluebride.design_pattern._04_action.command.command_2;

public interface ICommand {
	
	//执行操作
	void execute();
	//撤销操作
	void undo();
}
