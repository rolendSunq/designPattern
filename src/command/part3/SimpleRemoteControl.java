package command.part3;

public class SimpleRemoteControl {
	private Command slot;
	
	public SimpleRemoteControl() {
		//empty;
	}

	/**
	 * @param slot the slot to set
	 */
	public void setSlot(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
