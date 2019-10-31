package com.academy.git;

public class Calculator {

	System.out.println("Si no están estos cambios hay tabla!");

	System.out.println("También deberían estar estos cambios adicionales!");
	
	public static void main(String[] args) {
		
		int number1 = 7;
		int number2 = 4;
		
		int sum = sum(number1, number2);
		int sub = subtraction(number1, number2);
		
		System.out.println("The sum of " + number1 +" and " + 
		number2 + " equals: " + sum);
		System.out.println("The subtraction of " + number1 + " and " +
		number2 + " equals: " + sub);
		
	}
	
	public static int sum(int num1, int num2) {
	
		return num1 + num2;
	
	}
	
	public static int subtraction(int num1, int num2) {
		
		return num1 - num2;
		
	}

}
