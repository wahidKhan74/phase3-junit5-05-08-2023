package com.simplilearn.junitorg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
@DisplayName("Age Calculator Test Suit")
public class AppTest {

	App app ;
	
	// Junit Fixtures
	@BeforeEach
	public void setUp() {
		app = new App();
	}

	@AfterEach
	public void tearDown() {
		app = null;
	}

	@Test
	@DisplayName("Age should be a positive value")
	public void testAge1() {
		int actualAge = app.ageCalculator(1988);
		int expectedAg = 35;
		assertEquals(expectedAg, actualAge);
	}

	@Test
	@DisplayName("Age should be a 0 value for -ve input")
	public void testAge2() {
		int actualAge = app.ageCalculator(-1988);
		int expectedAg = 0;
		assertEquals(expectedAg, actualAge);
	}

	@Test
	@DisplayName("Age should be a 0 value for 0 input")
	public void testAge3() {
		int actualAge = app.ageCalculator(0);
		int expectedAg = 0;
		assertEquals(expectedAg, actualAge);
	}

	@Test
	@DisplayName("Age should be a 0 value for current year input")
	public void testAge4() {
		int actualAge = app.ageCalculator(2023);
		int expectedAg = 0;
		assertEquals(expectedAg, actualAge);
	}
}
