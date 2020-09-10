package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Dog;
import main.DogLogic;

public class DogTest2 {
	DogLogic dogLogic = new DogLogic();
	Dog dog = new Dog();
	@Test
	public void testWeight() {
		String expectedWeight = "Medium";
		dog.setWeight(90);
		assertFalse(expectedWeight.equals(dogLogic.weightCategory(dog)));
	}

}
