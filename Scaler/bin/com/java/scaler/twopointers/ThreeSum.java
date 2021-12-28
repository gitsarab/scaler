package com.java.scaler.twopointers;

/*
 3 Sum
Problem Description

Given an array A of N integers, find three integers in A such that the sum is closest to a given number B. Return the sum of those three integers.

Assume that there will only be one solution.



Problem Constraints
-108 <= B <= 108
1 <= N <= 104
-108 <= A[i] <= 108


Input Format
First argument is an integer array A of size N.

Second argument is an integer B denoting the sum you need to get close to.



Output Format
Return a single integer denoting the sum of three integers which is closest to B.



Example Input
Input 1:

A = [-1, 2, 1, -4]
B = 1
Input 2:

 
A = [1, 2, 3]
B = 6


Example Output
Output 1:

2
Output 2:

6


Example Explanation
Explanation 1:

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
Explanation 2:

 Take all elements to get exactly 6.
 */

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<Integer>();
		/*A.add(1);
		A.add(2);
		A.add(3);*/
		//A.add(-4);
		
		int[] Aarr =  new int[] { -4, -8, -10, -9, -1, 1, -2, 0, -8, -2 };
		
	//	int[] Aarr =  new int[] { 2, 1, -9, -7, -8, 2, -8, 2, 3, -8  };
		
		
		for(int i:Aarr) {
			A.add(i);
		}
		
		int B = 0;
		
		System.out.println("Sum: "+threeSumClosest(A, B));
		
	}
	
	 static int threeSumClosest(ArrayList<Integer> A, int B) {
		 
		 
		 Collections.sort(A);
		 
		 int i=0,j=0,k=0;
		 int x=0,y=0,z=0;
		 int target = 0;
		 
		 x = A.get(i);
		 
		 j = 1;k=A.size()-1;
		 
		 int min = Integer.MAX_VALUE;
		 int sum = 0;
		
		 for(i=0;i<A.size();i++) {
			 x = A.get(i);
			 target = B - x;
			 j=i+1;
			 k=A.size()-1;
			 
			 while(j<k) {
				 y=A.get(j);
				 z=A.get(k);
				 if((y+z) > target)
					 k--;
				 else if((y+z) < target)
					 j++;
				 else if((y+z)== target) {
					 System.out.println("Inside:"+x+","+y+","+z);
					 return (x+y+z);
				 }
			 }
			
			 System.out.println("Outside:"+x+","+y+","+z+" : sum :"+(x+y+z));
			 
			 int diff = Math.abs(B-(x+y+z));
			 System.out.println("Diff: "+diff);
			 if(diff < min) {
				min = diff;
				sum = x+y+z;
			 }
			 System.out.println("----------------------------------------"+sum);
		 }
			 
			// System.out.println("Outside:"+x+","+y+","+z);
		 System.out.println("Outside:"+sum);
		  return sum;
	    }

}
