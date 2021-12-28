package com.java.scaler.binary;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {1,2,3,4,5};
		int B = 3;
		
		Arrays.sort(A);
		
		/*for(int i=1;i<A.length;i++){
		    A[i]= A[i-1]+A[i];
		}*/
		
		int n = A.length;
		int lo = 0;
		int hi = A[n-1];
		int ans = Integer.MIN_VALUE;
		while(lo<=hi) {
			int D = lo + (hi-lo)/2;
			if(isValid(A,B,D)) {
				ans = Math.max(ans, D);
				lo = D+1;
			}else {
				hi = D-1;
			}
		}
		
		System.out.println("Value -"+ans);
		
	}
	
	static boolean isValid(int[] A, int B, int D) {
	//	System.out.println("D-"+D);
		int count = 1;
		int pos = 0;
		int i=1;
		int sum=0;
		while(i<A.length) {
			sum = A[i] - A[pos];
			if(sum>=D) {
				count++;
				pos = i;
			}
			i++;
			
			if(count==B)
				return true;
		}
		
		return false;
	}

}
