//package com.academy.git;

public class Calculator {

	System.out.println("Si no están estos cambios hay tabla!");

	System.out.println("También deberían estar estos cambios adicionales!");
	
	public static void main(String[] args) {
		
		int number1 = 7;
		int number2 = 4;
		
		int sum = sum(number1, number2);
		int sub = subtraction(number1, number2);
		double div = division(number1, number2);
		int mul = multiplication(number1, number2);
		
		System.out.println("\n");
		System.out.println("-------------SUM------------------");
		System.out.println("The sum of " + number1 +" and " + number2 + " equals: " + sum);
		System.out.println("----------SUBTRACTION------------");
		System.out.println("The subtraction of " + number1 + " and " + number2 + " equals: " + sub);
		System.out.println("-----------DIVISION--------------");
		System.out.println("The division of " + number1 + " and " + number2 + " equals: " + div);
		System.out.println("--------MULTIPLICATION-----------");
		System.out.println("The multiplication of " + number1 + " and " + number2 + " equals: " + mul);
		
	}
	
	public static int sum(int num1, int num2) {
	
		return num1 + num2;
	
	}
	
	public static int subtraction(int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	public static double division(int num1, int num2) {
		
		return num1 / num2;
		
	}
	
	public static int multiplication(int num1, int num2) {
		
		return num1 * num2;
		
	}

}
