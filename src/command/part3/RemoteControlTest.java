package command.part3;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		remote.setCommand(lightOnCommand);
		remote.buttonWasPressed();
		remote.setCommand(lightOffCommand);
		remote.buttonWasPressed();
		
    }

}
