package memento.part4;

import java.util.*;

public class Memento {
	private int money; // 소지금
	private ArrayList<String> fruits; // 과일
	private String stateCommand; // 실행 명령어 저장

	Memento(int money) { // 생성자(wide interface)
		this.money = money;
		this.fruits = new ArrayList<String>();
		stateCommand = "";
	}

	public int getMoney() { // 소지금을 얻는다(narrow interface)
		return money;
	}

	public void addFruit(String fruit) { // 과일을 추가한다(wide interface)
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
			System.out.println(fruit + "은 목록에 없습니다.");
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
	public List<String> getFruits() { // 과일을 얻는다(wide interface)
		stateCommand = EnumCommand.GETFRUITS.name();
		return (List<String>) fruits.clone();
	}

	public void setFruits(List<String> fruits) {
		this.fruits = (ArrayList<String>) fruits;
	}
	
	/**
	 * @return the stateCommand
	 */
	public String getStateCommand() {
		return stateCommand;
	}

	/**
	 * @param stateCommand the stateCommand to set
	 */
	public void setStateCommand(String stateCommand) {
		this.stateCommand = stateCommand;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("money: " + money + "\r\n");
		int index = 0;
		sb.append("fruits[");
		for (String str : fruits) {
			if (fruits.size() - 1 == index) {
				sb.append(str);
			} else {
				sb.append(str + ", ");
			}
			index++;
		}
		sb.append("]\r\n");
		sb.append("stateCommand: " + stateCommand + "\r\n");
		sb.append("\r\n");
		return sb.toString();
	}
}
