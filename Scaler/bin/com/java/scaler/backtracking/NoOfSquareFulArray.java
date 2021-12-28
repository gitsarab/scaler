package com.java.scaler.backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class NoOfSquareFulArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] A = new int[] {3,2,1};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(428);
		 A.add(56);
		 A.add(88);
		 A.add(12);

		System.out.println("ret-" + noOfSquareArrays(A));
	}

	static int noOfSquareArrays(ArrayList<Integer> A) {
		int n = A.size();
		// int[][] ret = new int[fact(n)][n];

		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> retSet = new HashSet<ArrayList<Integer>>();


	/*	if (A.size() == 1) {
			// ret.add(new Arra)
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(A.get(0));
			ret.add(arr);
			return ret;
		}*/

		// ArrayList<Integer> curr = new ArrayList<Integer>();
		int[] curr = new int[n];
		int[] used = new int[n];

		retSet = generateSet(curr, A, 0, n, used, retSet);
		
		ret = new ArrayList<>(retSet);
		System.out.println("List-"+ret);
		
		HashSet<Integer> no = new HashSet<Integer>();
		for(ArrayList<Integer> arr : ret) {
			for(int i=1;i<arr.size();i++) {
				int num = arr.get(i-1) +arr.get(i);
				System.out.println("Num-"+num);
				double sqrt = Math.ceil(Math.sqrt(num));
				System.out.println("Sqrt-"+sqrt);
				//System.out.println("whole num-"+Math.ceil(sqrt));
				if(sqrt == num/sqrt) {
					System.out.println("Sqrt Num-"+num);
					no.add(num);
				}
				
				System.out.println("---------------------------------------");
			}
		}

		return no.size();
	}

	
	static HashSet<ArrayList<Integer>> generateSet(int[] curr, ArrayList<Integer> A, int index, int n, int[] used,
			HashSet<ArrayList<Integer>> ret) {
		if (index == (n)) {
			ArrayList<Integer> n1 = new ArrayList<Integer>();
			for (int i = 0; i < curr.length; i++) {
				n1.add(curr[i]);
			}
			ret.add(n1);
			// return;
		}
		// ArrayList<Integer> used = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (used[i] == 1)
				continue;
			curr[index] = A.get(i);
			used[i] = 1;
			generateSet(curr, A, index + 1, n, used, ret);
			used[i] = 0;
		}

		return ret;

	}

}
