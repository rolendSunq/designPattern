package etcetera.composition;

public class DogMachineMain {
	public static void main(String[] args) {
		Dog gordonSetter = new Dog();
		gordonSetter.setName("蹺夥夥");
		gordonSetter.setAge("3");
		gordonSetter.setSex("male");
		gordonSetter.setSpecies("Gordon Setter");
		gordonSetter.setDogSound("條條懈");
		DogFoodMachine dfm = new DogFoodMachine(gordonSetter);
		dfm.runMachine("條條");
		dfm.runMachine("條條懈");
	}
}
