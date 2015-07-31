package memento.part4;

public class Memento4Main {

	public static void main(String[] args) {
		Memento memento = new Memento(100);
		CareTaker careTaker = new CareTaker();
		
		memento.moneyAdjustment(20, EnumCommand.PLUS);
		careTaker.add(memento);
		memento.addFruit("µþ±â");
		careTaker.add(memento);
		memento.addFruit("Æ÷µµ");
		careTaker.add(memento);
		memento.moneyAdjustment(30, EnumCommand.PLUS);
		careTaker.add(memento);
		for(Memento mt : careTaker.getAll()) {
			System.out.println(mt.toString());
		}
	}

}
