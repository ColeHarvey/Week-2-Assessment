package main;

public class Dog {
	private String breed;
	private int weight;
	private int age;

	public Dog () {
		
	}
	
	public Dog (String breed, int age, int weight) {
		this.setBreed(breed);
		this.setAge(age);
		this.setWeight(weight);
	}
	
	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}