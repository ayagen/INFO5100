package com.neu.q5.dog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.neu.q5.pet.Pet;

class TestDog {

	Dog dog;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testToString() {
		dog = new Dog("Spot", "Susan", "white", "medium");
		dog.setSex(Pet.SPAYED);
		String expected = "DOG:\n" + 
				"Spot owned by Susan\n" + 
				"Color: white\n" + 
				"Sex: Spayed\n" + 
				"Size: medium";
		assertEquals(expected, dog.toString());
	}
	
	@Test
	void testBoarding() {
		dog = new Dog("Tom", "Bob", "black", "big");
		dog.setBoardStart(10, 1, 2019);
		dog.setBoardEnd(10, 30, 2020);
		
		assertTrue(dog.boarding(12, 28, 2019));
		assertTrue(dog.boarding(10, 1, 2019));
		assertTrue(dog.boarding(5, 30, 2020));
		assertFalse(dog.boarding(5, 30, 2023));
		assertFalse(dog.boarding(5, 30, 2001));
	}

}
