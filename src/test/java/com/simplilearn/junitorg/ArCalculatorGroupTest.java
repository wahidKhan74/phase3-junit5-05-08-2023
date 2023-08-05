package com.simplilearn.junitorg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Arithmatic Calculator")
class ArCalculatorGroupTest {

	ArCalculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new ArCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Nested
	class Add{
		
		// Addition Test Cases
		@Test
		@DisplayName("Test should be of all Positive Numbers ")
		void testAddPositiveNumbers() {
			float actual = calculator.add(1000, 500);
			float expected = 1500;
			assertEquals(expected, actual);
		}

		@Test
		@DisplayName("Test should be of Positive & Negative Numbers")
		void testAddPositiveAndNegativeNumbers() {
			float actual = calculator.add(1000, -500);
			float expected = 500;
			assertEquals(expected, actual);
		}

		@Test
		@DisplayName("Test should be of Negative Numbers")
		void testAddNegativeNumbers() {
			float actual = calculator.add(-1000, -500);
			float expected = 0;
			assertEquals(expected, actual);
		}

		@Test
		@DisplayName("Test should be of Zero & Positive Numbers")
		void testAddZeroPositiveNumbers() {
			float actual = calculator.add(0, 500);
			float expected = 500;
			assertEquals(expected, actual);
		}

		@Test
		@DisplayName("Test should be of Zero Negative Numbers")
		void testAddZeroNegativeNumbers() {
			float actual = calculator.add(0, -500);
			float expected = 0;
			assertEquals(expected, actual);
		}
	}
	
	@Nested
	@DisplayName("Subtracton Test")
	class Sub {
		// Subtraction Test Cases
		@Test
		@DisplayName("Test Sub should be of all Positive Numbers ")
		void testSubPositiveNumbers() {
			float actual = calculator.sub(1000, 500);
			float expected = 500;
			assertEquals(expected, actual);
		}

		// Subtraction Test Cases
		@Test
		@DisplayName("Test Sub should be of all Positive Numbers ")
		void testSubPositiveAndNegativeNumbers() {
			float actual = calculator.sub(1000, -500);
			float expected = 0;
			assertEquals(expected, actual);
		}

		// Subtraction Test Cases
		@Test
		@DisplayName("Test Sub should be of all Positive Numbers ")
		void testSubPositiveAndNegativeNumbers2() {
			float actual = calculator.sub(-1000, 500);
			float expected = 0;
			assertEquals(expected, actual);
		}

		// Subtraction Test Cases
		@Test
		@DisplayName("Test Sub should be of Zero & Positive Numbers ")
		void testSubZeroAndPositiveNumbers() {
			float actual = calculator.sub(0, 500);
			float expected = 0;
			assertEquals(expected, actual);
		}
	}
	
	
	

	

}
