package com.bward;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Check if Prime: ");
		int number = scanner.nextInt();
		if (PrimeEvaluator.primeOrNot(number)) 
			System.out.println("Your Number is Prime");
		else
		    System.out.println("Your Number is Not Prime");
		
		scanner.close();
	}

}
