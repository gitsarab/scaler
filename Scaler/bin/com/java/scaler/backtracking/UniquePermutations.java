package com.java.scaler.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UniquePermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] A = new int[] {3,2,1};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		 A.add(2);
		 A.add(2);

		System.out.println("ret-" + permute(A));
	}

	static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		int n = A.size();
		// int[][] ret = new int[fact(n)][n];

		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> retSet = new HashSet<ArrayList<Integer>>();


		if (A.size() == 1) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(A.get(0));
			ret.add(arr);
			return ret;
		}

		int[] curr = new int[n];
		int[] used = new int[n];

		retSet = generateSet(curr, A, 0, n, used, retSet);
		
		ret = new ArrayList<>(retSet);

		return ret;
	}

	
	static HashSet<ArrayList<Integer>> generateSet(int[] curr, ArrayList<Integer> A, int index, int n, int[] used,
			HashSet<ArrayList<Integer>> ret) {
		if (index == (n)) {
			//System.out.println(curr);
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
