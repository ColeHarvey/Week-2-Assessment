package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Dog;
import main.DogLogic;

public class DogTest1 {
	DogLogic dogLogic = new DogLogic();
	Dog dog = new Dog();
	
	@Test
	public void testIsHusky() {
		dog.setBreed("Husky");
		assertTrue(dogLogic.isHusky(dog));
	}
	
	@Test
	public void testAgeHuman() {
		dog.setAge(7);
		assertEquals(49, dogLogic.ageHuman(dog), 0);
	}

}
