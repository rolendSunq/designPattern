package Observer.part1;

public class Observer1Main {

	public static void main(String[] args) {
		Person arpitPerson = new Person("Arpit");
		Person johnPerson = new Person("John");

		Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

		// �ɼ��� ����ϸ� ��ǰ�� ����� �� �˸���.
		// registerObserver method �������� ����ϰ� �����غ���.
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);

		// ���� ��ǰ�� ����Ѵ�.
		samsungMobile.setAvailability("Available");
	}

}
