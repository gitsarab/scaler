package com.java.scaler.array;

public class RepeatedMissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Q = new int[]{1,2,2,3,5};
		System.out.println("M & R -"+repeatedNumber(Q));

	}
	
	static int[] repeatedNumber(final int[] A) {
        
        int n = A.length;
        int totsum = n * (n+1)/2;
        int sqsum = n * (n+1) * ((2*n)+1)/6;
        
        int currsqsum = 0;
        int currsum = 0;
        
        for(int i=0;i<n;i++){
            currsqsum+= (A[i]*A[i]);
            currsum+=A[i];
        }
        
        int x = totsum - currsum;
        int y = sqsum - currsqsum;
        int z = y/x;
        
        int m = (z+x)/2;
        
        int l = m - x;
        System.out.println(m+"-"+l);
        
        return new int[]{m,l};
	}

}
