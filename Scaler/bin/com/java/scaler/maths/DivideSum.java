package com.java.scaler.maths;

public class DivideSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = -2147483648;
		int B = -1;
		System.out.println("Divide-"+divide( A,  B));
	}
	
	  static int divide(int A, int B) {
	        
	        int count = 0;
	        int origA = A;
	        int origB = B;
	        
	        if(A==0)
	            return 0;
	        long AA = A;
	        if(A < 0) {
	             AA = Math.abs(A);
	             if(AA == Integer.MIN_VALUE)
	            	 AA = Integer.MAX_VALUE;
	        }
	        if(B < 0)
	            B = 0-B;
	        
	        while(B<=AA){
	            AA = AA-B;
	            count++;
	        }
	        
	        if(origA<0 && origB <0){
	            
	        }else if(origA<0 || B < 0)
	            count = 0-count;
	        
	        return count;
	    }

}
