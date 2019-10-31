package com.academy.git;

public class Calculator {

	System.out.println("Si no están estos cambios hay tabla!");

	System.out.println("También deberían estar estos cambios adicionales!");
	
	public static void main(String[] args) {
		
		int number1 = 7;
		int number2 = 4;
		
		int sum = sum(number1, number2);
		System.out.println("The sum of " + number1 +" and " + 
		number2 + " equals: " + sum);
		
	}
	
	public static int sum(int num1, int num2) {
	
		return num1 + num2;
	}
	/**
	 * Resta
	 */
	public static int resta(int num1, int num2) {
		
		return num1 - num2;
	
	}
	
	/**
	 * Multiplicaci�n
	 */
	public static int mult(int num1, int num2) {
		
		return num1 * num2;
	
	}
	
	/**
	 * Division
	 */
	public static int division(int num1, int num2) {
		
		return num1 / num2;
	
	}
	

}
