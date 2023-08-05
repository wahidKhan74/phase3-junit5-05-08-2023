package com.simplilearn.junitorg;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The standard annotations for Junit")
//@Disabled
public class JunitAnnotations {
	
	// Junit Fixtures
	@BeforeEach
	public void setUp() {
		System.out.println("--- Before each test is executed. ---");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("--- After each test is executed. ---");
	}

	@BeforeAll
	public static void setUpAll() {
		System.out.println("--- Before All test is executed. ---");
	}
	
	@AfterAll
	public static void tearDownAll() {
		System.out.println("--- After All test is executed. ---");
	}
	
	
	@Test
	@DisplayName("Test One")
	public void testOne() {
		System.out.println("--- Test One is executed. ---");
		// fail();
	}
	
	@Test
	@DisplayName("Test Two")
	@Disabled
	public void testTwo() {
		System.out.println("--- Test Two is executed. ---");
		fail();
	}
	
	@Test
	@DisplayName("Test Three")
	public void testThree() {
		System.out.println("--- Test Three is executed. ---");
		// fail();
	}
	
}
