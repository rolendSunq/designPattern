package state.part1;

public class TvRemoteBasicMain {
	private String state = "";

	public void setState(String state) {
		this.state = state;
	}

	public void doAction() {
		if (state.equalsIgnoreCase("ON")) {
			System.out.println("Tv¸¦ ÄÕ´Ï´Ù.");
		} else if (state.equalsIgnoreCase("OFF")) {
			System.out.println("Tv¸¦ ²ü´Ï´Ù.");
		}
	}

	public static void main(String[] args) {
		TvRemoteBasicMain control = new TvRemoteBasicMain();
		control.setState("ON");
		control.doAction();
		control.setState("OFF");
		control.doAction();
	}

}
