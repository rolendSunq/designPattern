package etcetera.composition;

public class Dog {
	private String name;
	private String age;
	private String species;
	private String sex;
	private String dogSound;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getDogSound() {
		return dogSound;
	}
	
	public void setDogSound(String dogSound) {
		this.dogSound = dogSound;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("name: " + name + "\r\n");
		sb.append("age: " + age + "\r\n");
		sb.append("species: " + species + "\r\n");
		sb.append("sex: " + sex + "\r\n");
		sb.append("\r\n");
		return sb.toString();
	}

}
