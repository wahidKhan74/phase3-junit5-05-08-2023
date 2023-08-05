package com.simplilearn.junitorg;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Java8JunitTest {

	
	@Test
	@DisplayName("Sum of numbers with Java 8 Lambda expression")
	void lambdaExpressions() {
		List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(Integer :: intValue).sum();
		assertEquals(sum, 15);
	}
	
	@Test
	@DisplayName("Sum of numbers with should be greater 5")
	void lambdaExpressions2() {
		List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5);
		assertTrue(numbers.stream().mapToInt(Integer :: intValue).sum()> 5);
		assertTrue(numbers.stream().mapToInt(Integer :: intValue).sum()> 5, () -> "Sum should be greater than 5");
	}
	
	@Test
	@DisplayName("Group Assetions")
	void groupAssertion() {
		int[] numbers = {0, 1, 20, 3, 40};
		assertAll("Numbers", ()->  assertEquals(numbers[0], 0));
		assertAll("Numbers", ()->  assertEquals(numbers[0], 0), ()->  assertEquals(numbers[2], 20));
		assertAll("Numbers", 
				()->  assertEquals(numbers[0], 0), 
				()->  assertEquals(numbers[2], 20),
				()->  assertEquals(numbers[3], 3),
				()->  assertEquals(numbers[4], 40)
				);
	}
}
