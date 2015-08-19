package command.part4;

public class RemoteControl {
	private SimpleRemoteControl remote;
	private Light light;
	private GarageDoor garageDoor;
	private LightOnCommand lightOn;
	private GarageDoorOpenCommand garageOpen;

	public RemoteControl() {
		remote = new SimpleRemoteControl();
		light = new Light();
		garageDoor = new GarageDoor();
		lightOn = new LightOnCommand(light);
		garageOpen = new GarageDoorOpenCommand(garageDoor);
	}

	public void action() {
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
