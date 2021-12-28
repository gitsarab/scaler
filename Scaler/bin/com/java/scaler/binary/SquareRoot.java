package com.java.scaler.binary;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 930675566;
		
		System.out.println("sqrt -"+sqrt(A));

	}
	
	static int sqrt(int A) {
		 if(A==0 || A==1)
	            return A;
	        int ans = 1;
	        
	        int l = 1;
	        int r = A/2;
	        
	        while(l<=r){
	            int mid = l + (r-l)/2;
	            System.out.println("mid-"+mid);
	            if(mid == (A/mid))
	                return mid;
	            else if((mid)<(A/mid)){
	                ans = mid;
	                l= mid+1;
	            }else{
	                r = mid-1;
	            }
	        }
	        
	        
	        return ans;
	}

}
