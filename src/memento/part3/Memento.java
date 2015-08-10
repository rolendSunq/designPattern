package memento.part3;

import java.util.*;

public class Memento {
	int money; // ������
	ArrayList<String> fruits; // ����

	Memento(int money) { // ������(wide interface)
		this.money = money;
		this.fruits = new ArrayList<String>();
	}

	public int getMoney() { // �������� ��´�(narrow interface)
		return money;
	}

	void addFruit(String fruit) { // ������ �߰��Ѵ�(wide interface)
		fruits.add(fruit);
	}

	@SuppressWarnings("unchecked")
	List<String> getFruits() { // ������ ��´�(wide interface)
		return (List<String>) fruits.clone();
	}
}
