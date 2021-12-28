package com.java.scaler.binary;

public class SpecialInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {1,2,3,4,5};
		int B = 10;
		 int n = A.length;
	        int lo = 0;
	        int hi = n;
	        int ans = Integer.MIN_VALUE;
	        
	      //  int ans = 0;
	        
	        while(lo<=hi){
	            int D = lo + (hi-lo)/2;
	            if(isValidInt(A,B,D)){
	                ans = Math.max(ans,D);
	                lo = D+1;
	            }else{
	                hi = D-1;
	            }
	        }
	        
	        System.out.println("Answer-"+ans);
	     
	    // return ans;  
		
	}
	
	 static boolean isValidInt(int[] A, int B, int D){
	        int sum=0;
	        int i=0;
	        for(;i<D;i++){
	            sum+=A[i];
	            if(sum>B)
		            return false;
	        }
	        
	       
	        for(;i<A.length;i++){
	            sum = sum + A[i] - A[i-D];
	            if(sum>B)
	                return false;
	        }
	        
	        return true;
	    }

}
