package Observer.part1;

public class Observer1Main {

	public static void main(String[] args) {
		Person arpitPerson = new Person("Arpit");
		Person johnPerson = new Person("John");

		Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

		// When you opt for option "Notify me when product is available".Below �ɼ��� ����ϸ� ��ǰ�� ����� �� �˸���.
		// registerObserver method
		// get executed
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);

		// Now product is available
		samsungMobile.setAvailability("Available");
	}

}
