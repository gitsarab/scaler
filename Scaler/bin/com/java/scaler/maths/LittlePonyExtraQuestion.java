package com.java.scaler.maths;

public class LittlePonyExtraQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Max Count-"+solve(new int[] {2,3,2,3}));
	}

	static int[] solve(int[] A) {
		
		int sum = 0;
		int n=A.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i=0;i<n;i++) {
			sum = sum + A[i];
		}
		
		for(int i=0;i<n;i++) {
			A[i]=sum-A[i];
			min=Math.min(min, A[i]);
			max=Math.max(max, A[i]);
		}
		int maxCount=0;
		for(int i=0;i<n;i++) {
			if(A[i] == max)
				maxCount++;
			
		}
		
		return new int[] {maxCount,n};
	}
}
