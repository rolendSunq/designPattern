package etcetera.composition;

public class DogFoodMachine {
	private Dog dog;
	
	public DogFoodMachine(Dog dog) {
		this.dog = dog;
		setRecognize();
	}

	public void setRecognize() {
		System.out.println("성공적으로 인식되었습니다.");
	}

	public boolean recognize(String dogSound) {
		boolean okMyDog = false;
		if (dog.getDogSound().equals(dogSound)) {
			okMyDog = true;
		}
		return okMyDog;
	}
	
	public void getDogFood() {
		System.out.println(dog.getName() + "의 개 사료 200g을 준비하였습니다.");
	}
	
	public void runMachine(String dogSound) {
		if (recognize(dogSound)) {
			getDogFood();
		} else {
			System.out.println("인식되지 않은 개입니다.");
		}
	}
}
