package observer.part1;

public class Person implements Observer {

	String personName;

	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(String availabiliy) {

		System.out.println("�ȳ��ϼ���. " + personName + ", ���� �� ��ǰ�� " + availabiliy + " �츮 ��Ʈ�� ��ǰ�Դϴ�.");
	}

}
