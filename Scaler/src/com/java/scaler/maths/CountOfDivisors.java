package com.java.scaler.maths;

public class CountOfDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Divisors-"+solve(new int[] {20, 39, 29, 51, 96, 32, 35, 50, 57, 7, 59, 51, 85, 55, 8, 26, 15, 4, 4, 18, 32, 49, 40, 46, 83, 77, 100, 92}));
	}

	 static int[] solve(int[] A) {
	        int n= A.length;
	        int[] ans = new int[n];
	        
	        int count=0;
	        for(int i=0;i<n;i++){
	            count = 0;
	            for(int j=2;j<=Math.sqrt(A[i]);j++){
	                if(A[i]%j==0)
	                    count++;
	            }
	            if(Math.floor(Math.sqrt(A[i])) * Math.floor(Math.sqrt(A[i])) == A[i])
	                ans[i]=count*2 + 1;
	            else
	                ans[i]=count*2 + 2;
	        }
	        
	        return ans;
	    }
}
