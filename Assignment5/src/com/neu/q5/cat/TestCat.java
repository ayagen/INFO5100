package com.neu.q5.cat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.neu.q5.pet.Pet;

class TestCat {

	Cat cat;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testToString() {
		cat = new Cat("Tom", "Bob", "black", "short");
		cat.setSex(Pet.SPAYED);
		String expected = "CAT:\n" + 
				"Tom owned by Bob\n" + 
				"Color: black\n" + 
				"Sex: Spayed\n" + 
				"Hair: short";
		assertEquals(expected, cat.toString());
	}
	
	@Test
	void testBoarding() {
		cat = new Cat("Tom", "Bob", "black", "short");
		cat.setBoardStart(10, 1, 2019);
		cat.setBoardEnd(10, 30, 2020);
		
		assertTrue(cat.boarding(12, 28, 2019));
		assertTrue(cat.boarding(10, 1, 2019));
		assertTrue(cat.boarding(5, 30, 2020));
		assertFalse(cat.boarding(5, 30, 2023));
		assertFalse(cat.boarding(5, 30, 2001));
	}

}
