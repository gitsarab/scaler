package com.java.scaler.backtracking;

import java.util.ArrayList;

public class FillData {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		// A.add(3);

		int n = 3;

		System.out.println("ret-" + filldata(A, n));
	}

	static ArrayList<ArrayList<Integer>> filldata(ArrayList<Integer> A, int n) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

		/*
		 * if (A.size() == 1) { // ret.add(new Arra) ArrayList<Integer> arr = new
		 * ArrayList<Integer>(); arr.add(A.get(0)); ret.add(arr); return ret; }
		 */

		int[] curr = new int[n];

		ret = generate(curr, A, 0, n, ret);

		return ret;
	}

	static ArrayList<ArrayList<Integer>> generate(int[] curr, ArrayList<Integer> A, int index, int n,
			ArrayList<ArrayList<Integer>> ret) {
		if (index == (n)) {
			System.out.println(curr);
			ArrayList<Integer> n1 = new ArrayList<Integer>();
			for (int i = 0; i < curr.length; i++) {
				n1.add(curr[i]);
			}
			ret.add(n1);
			// return;
		}
		// ArrayList<Integer> used = new ArrayList<Integer>();

		if (index < n) {
			for (int i = 0; i < A.size(); i++) {
				curr[index] = A.get(i);
				generate(curr, A, index + 1, n, ret);
			}
		}
		return ret;

	}

}
