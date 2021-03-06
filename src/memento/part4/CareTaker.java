package memento.part4;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList;
	
	public CareTaker() {
		mementoList = new ArrayList<Memento>();
	}
	
	public void add(Memento state) {
		mementoList.add(saveMemento(state));
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
	
	public List<Memento> getAll() {
		return mementoList;
	}
	
	public void undo() {
		if (getAll().size() > 0) {
			mementoList.remove(mementoList.size() - 1);
		}
		
	}
	
	private Memento saveMemento(Memento memento) {
		Memento tempMemento = new Memento(memento.getMoney());
		tempMemento.setStateCommand(memento.getStateCommand());
		tempMemento.setFruits(memento.getFruits());
		return tempMemento;
	}
	
}
