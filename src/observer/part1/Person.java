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

		System.out.println("안녕하세요. " + personName + ", 지금 이 상품은 " + availabiliy + " 우리 마트의 상품입니다.");
	}

}
