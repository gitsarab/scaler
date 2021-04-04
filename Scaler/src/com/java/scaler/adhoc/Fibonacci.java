package com.java.scaler.adhoc;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println("Fibonacci of "+n+" is "+fibonacci(n));
	}
	
	public static int fibonacci(int n){
		if(n<=2) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
