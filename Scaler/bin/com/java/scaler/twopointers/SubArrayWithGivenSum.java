package com.java.scaler.twopointers;

import java.util.ArrayList;
import java.util.Collections;

/*
 Subarray with given sum
Problem Description

Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation
Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.
 * 
 */
public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> A = new ArrayList<Integer>();

//		int[] Aarr =  new int[] {15, 2, 48, 19, 28, 22, 44, 2, 32, 46, 46, 24, 1, 23, 49, 26, 23, 17, 17, 46, 4, 30, 40, 36, 20, 5};
		
//			int[] Aarr =  new int[] {42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37};
			
			int[] Aarr = new int[] { 1, 1000000000};
			for(int i:Aarr) {
				A.add(i);
			}
			
//			int B = 100;
//			int B = 82;
			int B = 1000000000;
			
			System.out.println("Sum: "+solve(A, B));
	}
	
	 static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
	        
	        ArrayList<Integer> retList = new ArrayList<Integer>();
	        
//	        Collections.sort(A);
	        int n = A.size();
	        int i=0;
	        int start=0;
	        int sum = A.get(0);
	        boolean isFound = false;
	       for( i=1;i<=n;i++){
	        	while(sum > B && start < i-1){
	                sum = sum - A.get(start);
	                start++;
	                
	            }
	        	if (sum == B){
	                isFound = true;
	                break;
	        	}
	            if(i<n)
	            	sum = sum + A.get(i);
	        }
	        
	        if(isFound){
	        	
	            for(int x=start;x<i;x++){
	                retList.add(A.get(x));
	            }
	            
	            return retList;
	        }
	        
	        retList.add(-1);
	        
	        return retList;
	    }

}
