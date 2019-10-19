package com.neu.q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberTest {

	Number number;
	
	@BeforeEach
	void setUp() throws Exception {
		number = new Number();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCountNormal() {
		int result = number.count(6, 3);
		assertEquals(result, 2);
	}
	
	@Test
	void testCountWhenException() {
		int result = number.count(6, 0);
		assertEquals(result, Integer.MIN_VALUE);
	}

}
