package com.java.scaler.twopointers;

import java.util.ArrayList;
import java.util.Collections;

/*
 
 Pairs with Given Difference
Problem Description

Given an one-dimensional integer array A of size N and an integer B.

Count all distinct pairs with difference equal to B.

Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.



Problem Constraints
1 <= N <= 104

0 <= A[i], B <= 105



Input Format
First argument is an one-dimensional integer array A of size N.

Second argument is an integer B.



Output Format
Return an integer denoting the count of all distinct pairs with difference equal to B.



Example Input
Input 1:

 A = [1, 5, 3, 4, 2]
 B = 3
Input 2:

 A = [8, 12, 16, 4, 0, 20]
 B = 4
Input 3:

 A = [1, 1, 1, 2, 2]
 B = 0


Example Output
Output 1:

 2
Output 2:

 5
Output 3:

 2


Example Explanation
Explanation 1:

 There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2} 
Explanation 2:

 There are 5 unique pairs with difference 4, the pairs are {0, 4}, {4, 8}, {8, 12}, {12, 16} and {16, 20} 
Explanation 3:

 There are 2 unique pairs with difference 0, the pairs are {1, 1} and {2, 2}.


 */
public class PairsWithGivenDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		
		int B = 0;
		
		System.out.println("Count-"+solve(A, B));
	}
	
	static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int i=0;
        int j=1;
        int n = A.size();
        
        int count = 0;
        while(i<=j && i<n && j<n){
            if ((A.get(j) - A.get(i)) < B)
                j++;
            else if((A.get(j) - A.get(i)) > B)
                i++;
            else if(((A.get(j) - A.get(i)) == B)){
                if ( i !=0 && j!=0 && (A.get(j) == A.get(j-1)) && (A.get(i) == A.get(i-1)) ){
                    
                }else if((i!=j))
                    count ++;
                i++;
                j++;
            }
        }
        
        return count;
    }

}
