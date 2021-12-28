package com.java.scaler.binary;

public class AllocateBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {  26, 66, 98, 85, 62, 18, 53, 79, 3, 83, 23, 59, 21, 74, 34, 75, 2, 36, 79, 15, 50, 13, 50, 92, 48, 83};
		int B = 13;
		
		int n = A.length;
        int max = 0;
        int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			max = Math.max(max,A[i]);
		}

		int l = max;
		int r = sum;
		int ans = Integer.MAX_VALUE;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (isPossible(A, B, mid) <=B) {
				ans = Math.min(ans, mid);
				r = mid - 1;
			} else {
				l = mid+1;
			}
		}

		System.out.println("Ans-" + ans);
	}

	static int isPossible(int[] A, int B, int P) {
		int count = 0;
		int sum = 0;
		
		for(int i = 0;i<A.length;i++) {
			if( (sum + A[i]) > P) {
				count ++;
				sum = A[i];
			}else {
				sum = sum + A[i];
			}
		}
	
		if(sum<=P)
			count++;
		
		
	return count;

}

}
