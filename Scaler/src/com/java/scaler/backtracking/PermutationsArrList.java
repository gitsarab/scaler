package com.java.scaler.backtracking;

import java.util.ArrayList;

public class PermutationsArrList {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//int[] A = new int[] {3,2,1};
			ArrayList<Integer> A = new ArrayList<Integer>();
			A.add(1);
			//A.add(2);
			//A.add(3);
			
			
			System.out.println("ret-"+permute(A));
		}
		static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
			int n = A.size();
//			int[][] ret = new int[fact(n)][n];
			
			ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	        
	        if (A.size()==1){
	        	//ret.add(new Arra)
	        	ArrayList<Integer> arr = new ArrayList<Integer>();
	        	arr.add(A.get(0));
	            ret.add(arr);
	            return ret;
	        }
	        
	        
			//ArrayList<Integer> curr = new ArrayList<Integer>();
			int[] curr = new int[n];
			int[] used = new int[n];
			
			ret = generate(curr, A, 0,n, used,ret);
			
			return ret;
	    }
		
		
		static ArrayList<ArrayList<Integer>> generate(int[] curr, ArrayList<Integer> A, int index, int n, int[] used, ArrayList<ArrayList<Integer>> ret) {
				if(index == (n)) {
					System.out.println(curr);
					ArrayList<Integer> n1 = new ArrayList<Integer>();
					for(int i=0;i<curr.length;i++) {
						n1.add(curr[i]);
					}
					ret.add(n1);
					//return;
				}
//				ArrayList<Integer> used = new ArrayList<Integer>();
				
				for(int i=0;i<n;i++) {
					if(used[i]==1)
						continue;
					curr[index] = A.get(i);
					used[i] = 1;
					generate(curr,A,index+1,n,used,ret);
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
