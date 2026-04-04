package org.bluebride.design_pattern._04_action.command.command_2;

public class LightOnCommand implements ICommand {
	
	private LightCommandReceiver lightCommandReceiver;
	
	public LightOnCommand(LightCommandReceiver lightCommandReceiver) {
		this.lightCommandReceiver = lightCommandReceiver;
	}

	@Override
	public void execute() {
		lightCommandReceiver.on();
	}

	@Override
	public void undo() {
		lightCommandReceiver.off();
	}

}
