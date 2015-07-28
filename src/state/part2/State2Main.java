package state.part2;

public class State2Main {

	public static void main(String[] args) {
		TVContext tvContext = new TVContext();
		TVStartState tvStartState = new TVStartState();
		TVStopState tvStopState = new TVStopState();
		
		tvContext.setState(tvStartState);
		tvContext.doAction();
		
		tvContext.setState(tvStopState);
		tvContext.doAction();
	}

}
