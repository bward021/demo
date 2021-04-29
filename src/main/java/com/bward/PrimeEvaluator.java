package com.bward;

public class PrimeEvaluator {
	  public static boolean primeOrNot(int number) {
		    int testNumber = (number / 2);
		    boolean isPrime = true;
		    for (int i = 2; i <= testNumber; i++) {
		      if (number % i == 0)
		        isPrime = false;
		    }
		    return isPrime;
		  }
}
