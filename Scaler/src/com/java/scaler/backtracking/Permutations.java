package com.java.scaler.backtracking;

import java.util.ArrayList;

public class Permutations {

	//static int[][] ret;
	//static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {3,2,1};
		/*ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);*/
		
		
		System.out.println("ret-"+permute(A));
	}
	static int[][] permute(int[] A) {
		int n = A.length;
		int[][] ret = new int[fact(n)][n];
        
        if (A.length==1){
            ret[0][0] = A[0];
            return ret;
        }
        
        
		//ArrayList<Integer> curr = new ArrayList<Integer>();
		int[] curr = new int[n];
		int[] used = new int[n];
		
		ret = generate(curr, A, 0,n, used,ret,0);
		
		return ret;
    }
	
	
	static int[][] generate(int[] curr, int[] A, int index, int n, int[] used, int[][] ret, int count) {
			if(index == (n)) {
				System.out.println(curr);
				for(int i=0;i<curr.length;i++) {
					ret[count][i]=curr[i];
				}
				count++;
				//return;
			}
//			ArrayList<Integer> used = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++) {
				if(used[i]==1)
					continue;
				curr[index] = A[i];
				used[i] = 1;
				generate(curr,A,index+1,n,used,ret,count);
				used[i] = 0;
			}
			
		return ret;
		
	}
	
	static int fact(int A) {
		int fact = 1;
		for(int i=1;i<=A;i++) {
			fact*=i;
		}
		return fact;
	}

}
