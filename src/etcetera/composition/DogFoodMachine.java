package etcetera.composition;

public class DogFoodMachine {
	private Dog dog;
	
	public DogFoodMachine(Dog dog) {
		this.dog = dog;
		setRecognize();
	}

	public void setRecognize() {
		System.out.println("���������� �νĵǾ����ϴ�.");
	}

	public boolean recognize(String dogSound) {
		boolean okMyDog = false;
		if (dog.getDogSound().equals(dogSound)) {
			okMyDog = true;
		}
		return okMyDog;
	}
	
	public void getDogFood() {
		System.out.println(dog.getName() + "�� �� ��� 200g�� �غ��Ͽ����ϴ�.");
	}
	
	public void runMachine(String dogSound) {
		if (recognize(dogSound)) {
			getDogFood();
		} else {
			System.out.println("�νĵ��� ���� ���Դϴ�.");
		}
	}
}
