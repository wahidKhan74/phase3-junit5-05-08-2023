package com.simplilearn.junitorg;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ArrayComparisionTest {

	
	@Test
	public void compare1() {
		String[] courses = {"Java", "NodeJs", "AWS", "HTML"};
		String[] selectedCourses = {"Java", "AWS", "HTML"};
		
		assertArrayEquals(courses, selectedCourses);
	}
	
	@Test
	public void compare2() {
		String[] courses = {"Java", "NodeJs", "AWS", "HTML"};
		String[] courses2 = {"Java", "Dcoker", "AWS", "HTML"};
		
		// assertArrayEquals(courses, courses2);
		assertNotEquals(courses, courses2);
	}
}
