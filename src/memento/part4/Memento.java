package memento.part4;

import java.util.*;

public class Memento {
	int money; 							// ������
	ArrayList<String> fruits; 		// ����
	private String stateCommand;	// ���� ���ɾ� ����

	Memento(int money) { // ������(wide interface)
		this.money = money;
		this.fruits = new ArrayList<String>();
		stateCommand = "";
	}

	public int getMoney() { // �������� ��´�(narrow interface)
		return money;
	}

	public void addFruit(String fruit) { // ������ �߰��Ѵ�(wide interface)
		fruits.add(fruit);
		stateCommand = EnumCommand.ADDFRUIT.name();
	}
	
	public boolean delFruit(String fruit) {
		int fruitIndex = fruits.indexOf(fruit);
		if (fruitIndex != -1) {
			fruits.remove(fruitIndex);
			stateCommand = EnumCommand.DELFRUIT.name();
			return true;
		} else {
			System.out.println(fruit + "�� ��Ͽ� �����ϴ�.");
			return false;
		}
	}
	
	public void moneyAdjustment(int money, EnumCommand state) {
		if (state.name().equals("PLUS")) {
			this.money += money;
			stateCommand = EnumCommand.MONEYADJUSTMENT.name();
		} else if (state.name().equals("MINUS")) {
			this.money -= money;
			stateCommand = EnumCommand.MINUS.name();
		}
	}

	@SuppressWarnings("unchecked")
	List<String> getFruits() { // ������ ��´�(wide interface)
		stateCommand = EnumCommand.GETFRUITS.name();
		return (List<String>) fruits.clone();
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("money: " + money + "\r\n");
		int index = 0;
		for (String str : fruits) {
			if (index == 0) {
				sb.append("fruits[" + str + ", ");
			} else if (fruits.size() - 1 == index) {
				sb.append(str + "]\r\n");
			} else {
				sb.append(str + ", ");
			}
			index++;
		}
		sb.append("stateCommand: " + stateCommand + "\r\n");
		sb.append("\r\n");
		return sb.toString();
	}
}