package com.java.scaler.bitmanipulation;

public class DiffBitsSumPairwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DiffBitsSumPairwise -"+cntBits(new int[] {2,3}));
	}
	
	static int cntBits(int[] A) {
		
		int mod = 1000 * 1000 * 1000 + 7;
		int n = A.length;
		long ans = 0;
		long count = 0;
		for(int i=0;i<32;i++) {
			count = 0;
			for(int j=0;j<n;j++) {
				if((A[j] & (1 <<i ) ) > 0)
					count++;
			}
			ans = ((ans % mod )+ ((count*(n-count)*2) %mod) ) % mod;
		}
		
		return (int)ans;
    }

}
