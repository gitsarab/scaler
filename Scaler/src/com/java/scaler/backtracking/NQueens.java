package com.java.scaler.backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A= 8;
		
		System.out.println("Queen Array-"+solveNQueens(A));
	}
	
	static ArrayList<ArrayList<String>> solveNQueens(int a) {
	
		HashSet<ArrayList<String>> result = new HashSet<ArrayList<String>>();
		ArrayList<String> strrow = new ArrayList<String>();
		
		solve(0,0,strrow,result,a);
		
		ArrayList<ArrayList<String>> resultarr = new ArrayList<ArrayList<String>>(result);

		
		return resultarr;
	}
	
	static void solve(int row, int col, ArrayList<String> strrow, HashSet<ArrayList<String>> result , int a) {
		if(row==a) {
			ArrayList<String> arr = new ArrayList<String>();
			arr = populateDots(strrow);
			result.add(arr);
			//strrow = new ArrayList<String>();
			return;
		}
		StringBuilder strB = new StringBuilder("");
		for(int j=0;j<a;j++) {
			if(check(row, j, strrow, a)) {
				strB.append("Q");
				strrow.add(strB.toString());
				solve(row+1,j,strrow,result,a);
				strrow.remove(row);
				strB.deleteCharAt(j);
				strB.append(".");
			}else {
				strB.append(".");
			}
			
		}
		return;
		
	}
	
	static boolean check(int row, int col, ArrayList<String> strrow, int n) {
		for(int i=row-1; i>=0;i--) {
			if(strrow.get(i).length()>=(col+1) && strrow.get(i).charAt(col) == 'Q')
				return false;
		}
		
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(strrow.get(i).length()>=(j+1) && strrow.get(i).charAt(j) == 'Q')
				return false;
		}
		
		for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++) {
			if(strrow.get(i).length()>=(j+1) && strrow.get(i).charAt(j) == 'Q')
				return false;
		}
		
		return true;
	}
	
	static ArrayList<String> populateDots(ArrayList<String> strrow){
		int n = strrow.size();
		ArrayList<String> retarr = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			String str = strrow.get(i);
			StringBuilder strB = new StringBuilder(str);
			int length = str.length();
			for(int j=length;j<n;j++) {
				strB.append(".");
			}
			retarr.add(strB.toString());
		}
		
		return retarr;
	}

}
