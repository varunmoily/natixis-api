package com.Junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void check() {
		Factorial f = new Factorial();
		assertAll(
				()->assertEquals(120, f.check(5)));
	}

}
