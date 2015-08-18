package command.part3;

public class RemoteControl {
	public final int COMMAND_STORAGE_SIZE;
	private Command[] onCommands;
	private Command[] offCommands;

	public RemoteControl() {
		COMMAND_STORAGE_SIZE = 7;
		onCommands = new Command[COMMAND_STORAGE_SIZE];
		offCommands = new Command[COMMAND_STORAGE_SIZE];

		Command noCommand = new NoCommand();

		for (int i = 0; i < COMMAND_STORAGE_SIZE; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n---------- Remote Control ----------\r\n");
		for (int i = 0; i < onCommands.length; i++) {
			sb.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "    "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return super.toString();
	}
}
