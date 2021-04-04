package com.java.scaler.combinatorics;

public class NCRP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8458, r = 506, p = 540907;
        System.out.println("Value of nCr % p is "
                           + solve(n, r, p));
	}

	static int solve(int A, int B, int C) {

		if (A < B)
			return 0;

		if (B == 0)
			return 1;

		long[] fact = new long[A + 1];
		fact[0] = 1;

		for (int i = 1; i <= A; i++) {
			fact[i] = (fact[i - 1] * i) % C;
		}

		return (int) (fact[A]  * invmodulus(fact[B], C) % C * invmodulus(fact[A - B], C) % C) % C;
	}

	static long invmodulus(long a, int p) {
		return power(a, p - 2, p);
	}

	static long power(long aa, long b, int c) {
		long  ans = 1;
		//long aa = a;
		System.out.println("a,b,c-"+aa+"-"+b+"-"+c);
		aa = aa % c;

		while (b > 0) {
			if (b % 2 == 1) {
				ans = (ans * aa) % c;
			}
			b = b >> 1;
			aa = (aa * aa) % c;
			System.out.println("a,b-"+aa+"-"+b);
			System.out.println("Sum-"+ans);
		}

		return ans % c;
	}

}
