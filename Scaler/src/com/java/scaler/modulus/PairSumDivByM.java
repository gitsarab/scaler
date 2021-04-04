package com.java.scaler.modulus;

public class PairSumDivByM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 2, 2, 1, 7, 5, 3 };
        //int n = 6;
        int K = 4;
        System.out.print(solve(A, K));
	}
	
	 static int solve(int[] A, int B) {
	        
	        int count = 0;
	        
	        for(int i=0;i<A.length;i++){
	            A[i] = A[i] % B;
	        }
	        
	        int[] freq = new int[B];
	        
	        for(int i =0; i<A.length;i++){
	        	freq[A[i]] = freq[A[i]]+1;
	        }
	        
	        int j=B-1;
	        int i=1;
	        
	        while(i<j) {
	        	count = count +(freq[i]*freq[j]);
	        	i++;
	        	j--;
	        }
	        if(B%2==0) {
	        	count = count+ (freq[B/2] * (freq[B/2]-1)/2);
	        }
	        count = count + (freq[0] * (freq[0]-1)/2);
	        
	        return count;
	    }

}
