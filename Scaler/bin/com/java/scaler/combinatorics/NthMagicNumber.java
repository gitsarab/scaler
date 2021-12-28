package com.java.scaler.combinatorics;

public class NthMagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Val-"+solve(73));
	}

	static int solve(int A) {

		int val = 1;
		int count = 0;
		while (val <= A) {
			val = val * 2;
			count++;
		}
		System.out.println("val-" + val);
		System.out.println("count-" + count);
		int sum = 0;
		for (int i = 0; i < count; i++) {
			if ((A & (1 << i)) > 0) {
				sum = sum + (int) Math.pow(5, i+1);
				System.out.println("Sum-" + sum + "-i-" + i);
			}
		}

		return sum;
	}

}
