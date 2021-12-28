package com.java.scaler.backtracking;

import java.util.ArrayList;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 9;
		int B = 1;

		System.out.println("ArrayList-" + combinations(A, B));

	}

	static ArrayList<ArrayList<Integer>> combinations(int A, int B) {

		int[] curr = new int[B];
		int[] used = new int[A + 1];
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

		if (B == 1) {
			// ret.add(new Arra)
			
			for(int i=1;i<=A;i++) {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				arr.add(i);
				ret.add(arr);
			}
			
			return ret;
		}

		ret = generate(curr, used, 0, B, A, ret);

		return ret;
	}

	static ArrayList<ArrayList<Integer>> generate(int[] curr, int[] used, int index, int B, int A,
			ArrayList<ArrayList<Integer>> ret) {
		if (index == B) {
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			boolean isCorrect = true;
			for (int i = 0; i < B; i++) {
				if (i > 0 && curr[i] < curr[i - 1]) {
					isCorrect = false;
					break;
				}
				arr1.add(curr[i]);
			}
			if (isCorrect)
				ret.add(arr1);
		}

		if (index < B) {
			for (int i = 1; i <= A; i++) {
				if (used[i] == 1)
					continue;

				/*
				 * if(index != 0 && curr[index] < curr[index-1]) continue;
				 */

				curr[index] = i;
				used[i] = 1;
				generate(curr, used, index + 1, B, A, ret);
				used[i] = 0;
			}
		}

		return ret;
	}
}
