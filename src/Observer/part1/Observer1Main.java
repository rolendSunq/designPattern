package Observer.part1;

public class Observer1Main {

	public static void main(String[] args) {
		Person arpitPerson = new Person("Arpit");
		Person johnPerson = new Person("John");

		Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

		// When you opt for option "Notify me when product is available".Below 옵션을 사용하면 제품을 사용할 때 알린다.
		// registerObserver method
		// get executed
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);

		// Now product is available
		samsungMobile.setAvailability("Available");
	}

}
