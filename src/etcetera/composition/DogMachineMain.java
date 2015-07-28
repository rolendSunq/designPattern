package etcetera.composition;

public class DogMachineMain {
	public static void main(String[] args) {
		Dog gordonSetter = new Dog();
		gordonSetter.setName("�߹ٹ�");
		gordonSetter.setAge("3");
		gordonSetter.setSex("male");
		gordonSetter.setSpecies("Gordon Setter");
		gordonSetter.setDogSound("������");
		DogFoodMachine dfm = new DogFoodMachine(gordonSetter);
		dfm.runMachine("����");
		dfm.runMachine("������");
	}
}
