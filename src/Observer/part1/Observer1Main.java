package Observer.part1;

public class Observer1Main {

	public static void main(String[] args) {
		Person arpitPerson = new Person("Arpit");
		Person johnPerson = new Person("John");

		Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

		// 옵션을 사용하면 제품을 사용할 때 알린다.
		// registerObserver method 옵저버를 등록하고 실행해본다.
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);

		// 지금 제품을 사용한다.
		samsungMobile.setAvailability("Available");
	}

}
