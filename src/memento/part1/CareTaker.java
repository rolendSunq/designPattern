package memento.part1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList;

	public CareTaker() {
		mementoList = new ArrayList<Memento>();
	}

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}
