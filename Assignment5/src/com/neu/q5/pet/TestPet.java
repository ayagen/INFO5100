package com.neu.q5.pet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPet {

	public Pet pet;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		pet = new Pet("Miar", "Jack", "While and Pink");
		String expected = "Miar owned by Jack\n" + 
				"Color: While and Pink\n" + 
				"Sex: Male";
		assertEquals(expected, pet.toString());
	}
	
	@Test
	void testSetSex() {
		pet = new Pet("Miar", "Jack", "While and Pink");
		pet.setSex(Pet.SPAYED);
		String expected = "Miar owned by Jack\n" + 
				"Color: While and Pink\n" + 
				"Sex: Spayed";
		assertEquals(expected, pet.toString());
	}

}
