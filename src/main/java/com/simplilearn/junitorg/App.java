package com.simplilearn.junitorg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
    }
    
    public int ageCalculator(int yearOfBirth) {
    	int currentYear = 2023;
    	int age = 0;
    	if(yearOfBirth>0) {
    		age =  currentYear - yearOfBirth;
    		return age;
    	}
    	return age;
    }
}
