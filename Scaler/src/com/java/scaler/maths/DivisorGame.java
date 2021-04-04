package com.java.scaler.maths;

public class DivisorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Divisor Game-" + solve(81991, 2549, 7));
	}

	static int solve(int A, int B, int C) {

		int lcm = lcm(B, C);
		if (lcm == 1)
			return 0;
		int count = 0;

		for (int i = lcm; i <= A; i = i + lcm) {
			if (i % B == 0 && i % C == 0)
				count++;
		}

		return count;
	}

	static int gcd(int B, int C) {
		if (B == C)
			return B;
		if (B < C) {
			int temp = C;
			C = B;
			B = temp;
		}

		return gcd(B - C, C);
	}

	static int lcm(int B, int C) {
		if (B > C && B % C == 0)
			return B;
		else if (C > B && C % B == 0)
			return C;
		else if (B == C)
			return B;

		int gcd = gcd(B, C);

		for (int i = (Math.min(B, C)); i <=(B * C); i = i + gcd) {
			if (i % B == 0 && i % C == 0)
				return i;
		}

		return 1;
	}

}
