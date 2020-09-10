package main;

public class DogLogic {

	public boolean isHusky(Dog dog) {
		return dog.getBreed().equals("Husky");
	}
	
	public int ageHuman(Dog dog) {
		int humanYears = dog.getAge() * 7;
		return humanYears;
	}
	
	public String weightCategory(Dog dog) {
		if (dog.getWeight() >= 75) {
			return "Large";
		} else if (dog.getWeight() >= 50) {
			return "Medium";
		} else return "Small";
	}
}
