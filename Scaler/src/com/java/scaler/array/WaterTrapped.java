package com.java.scaler.array;

public class WaterTrapped {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println("Water Trapped-"+trap(A));

	}

	 static int trap(final int[] A) {
	        
	        int len = A.length;
	        int[] leftmax = new int[len];
	        int[] rightmax = new int[len];
	        int max = 0;
	        leftmax[0] = 0;
	        rightmax[len-1]=0;
	        for(int i=1;i<len;i++){
	            max = Math.max(max,A[i-1]);
	            leftmax[i]=max;
	        }
	        max=0;
	        for(int i=len-2;i>=0;i--){
	            max = Math.max(max,A[i+1]);
	            rightmax[i]=max;
	        }
	        
	        System.out.println("Left Max-"+leftmax);
	        System.out.println("Right Max-"+rightmax);
	        int water = 0;
	        for(int i=1;i<len-1;i++){
	        	if((Math.min(leftmax[i],rightmax[i]) - A[i]) > 0)
	        		water = water + (Math.min(leftmax[i],rightmax[i]) - A[i]);
	        }
	        
	        return water;
	    }
}
