package com.java.scaler.maths;

public class ModSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] A = new int[] {17,100,11};
		
		System.out.println("Mod Sum-"+solve(A));
	}

	static int solve(int[] A) {

		int[] freq = new int[1000];
		int n = A.length;
		int mod = 1000000007;

		for (int i = 0; i < n; i++) {
			freq[A[i]] = freq[A[i]] + 1;
		}

		long sum = 0;
		long sumi = 0;
		
		for (int i = 0; i < 1000; i++) {
			sumi=0;
			for (int j = 0; j < n; j++) {
				if (freq[i] != 0) {
					sumi = ((sumi % mod) + (i % A[j]) % mod) % mod;
				}
			}

			sum = sum + (sumi % mod * freq[i]) % mod;
		}

		return (int) (sum % mod);

	}
}
