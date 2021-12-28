package com.java.scaler.binary;

public class SingleElementSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[] {25, 25, 42, 42, 70, 70, 82, 82, 118, 118, 139, 139, 191, 191, 208, 257, 257, 264, 264, 278, 278, 334, 334, 406, 406, 430, 430, 436, 436, 484, 484 };

		System.out.println("Single Element-"+singleElement(A, 0, A.length-1));
	}
	
	 static int singleElement(int[] A, int start, int end){
		 
		 
		 	if((end-start)==1) {
		 		if(start==0)
		 			return A[start];
		 		else if(end==(A.length-1))
		 			return A[end];
		 	}else if(start==end)
		 		return A[start];
		 	
		 		
	        
	        int mid = (start + end)/2;
	        if(mid%2 == 0){
	        	if(A[mid]==A[mid+1])
	        		start = mid+2;
	        	else if(A[mid]==A[mid-1])
	        		end = mid-2;
	        	else
	        		return A[mid];
	        }else {
	        	if(A[mid]==A[mid+1])
	        		end = mid-1;
	        	else if(A[mid]==A[mid-1])
	        		start = mid+1;
	        	else
	        		return A[mid];
	        }
	        
	        return singleElement(A,start,end);
	    
	    }

}
