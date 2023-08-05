package com.simplilearn.junitorg;

public class ArCalculator {
	
	// addition 
	public float add(int num1, int num2) {
		if(num1> num2 && num1>0)
			return  num1 + num2;
		else if(num1<num2 && num2>0)
			return  num1 + num2;
		else 
			return 0;
	}

	//subtraction
	public float sub(int num1, int num2) {
		if(num1>num2 && num1>0 && num2>0)
			return num1 - num2;
		else 
			return 0;
	}

	// multiplication
	
	// division
}
