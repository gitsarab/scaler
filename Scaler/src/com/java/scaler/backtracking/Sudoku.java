package com.java.scaler.backtracking;

import java.util.ArrayList;

public class Sudoku {

	static int[][] row = new int[9][9];
	static int[][] col = new int[9][9];
	static int[][][] grid = new int[3][3][9];
	static int n = 9;
	static ArrayList<ArrayList<Character>> aa = new ArrayList<ArrayList<Character>>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Character> c1arr = new ArrayList<Character>();
		char[] c1 = new char[] {'5','3','.','.','7','.','.','.','.'};
		char[] c2 = new char[] {'6','.','.','1','9','5','.','.','.'};
		char[] c3 = new char[] {'.','9','8','.','.','.','.','6','.'};
		char[] c4 = new char[] {'8','.','.','.','6','.','.','.','3'};
		char[] c5 = new char[] {'4','.','.','8','.','3','.','.','1'};
		char[] c6 = new char[] {'7','.','.','.','2','.','.','.','6'};
		char[] c7 = new char[] {'.','6','.','.','.','.','2','8','.'};
		char[] c8 = new char[] {'.','.','.','4','1','9','.','.','5'};
		char[] c9 = new char[] {'.','.','.','.','8','.','.','7','9'};
		
		ArrayList<Character> c1arr = new ArrayList<Character>();
		ArrayList<Character> c2arr = new ArrayList<Character>();
		ArrayList<Character> c3arr = new ArrayList<Character>();
		ArrayList<Character> c4arr = new ArrayList<Character>();
		ArrayList<Character> c5arr = new ArrayList<Character>();
		ArrayList<Character> c6arr = new ArrayList<Character>();
		ArrayList<Character> c7arr = new ArrayList<Character>();
		ArrayList<Character> c8arr = new ArrayList<Character>();
		ArrayList<Character> c9arr = new ArrayList<Character>();
		for(int i=0;i<c1.length;i++) {
			c1arr.add(c1[i]);
			c2arr.add(c2[i]);
			c3arr.add(c3[i]);
			c4arr.add(c4[i]);
			c5arr.add(c5[i]);
			c6arr.add(c6[i]);
			c7arr.add(c7[i]);
			c8arr.add(c8[i]);
			c9arr.add(c9[i]);
		}

		ArrayList<ArrayList<Character>> a = new ArrayList<ArrayList<Character>>();
		
		a.add(c1arr);
		a.add(c2arr);
		a.add(c3arr);
		a.add(c4arr);
		a.add(c5arr);
		a.add(c6arr);
		a.add(c7arr);
		a.add(c8arr);
		a.add(c9arr);
		
		solveSudoku(a);
		
		System.out.println("Solved-"+a);
	}

	static void solveSudoku(ArrayList<ArrayList<Character>> a) {
		 aa = new ArrayList<ArrayList<Character>>(a);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a.get(i).get(j) != '.') {
					int val =  Integer.parseInt(Character.toString(a.get(i).get(j))) - 1;
					row[i][val] = 1;
					col[j][val] = 1;
					grid[i/3][j/3][val] = 1;
				}
			}
		}
		
		solve(aa,0);
		
		System.out.println("solveSudoku-"+aa);
		
	}
	
	static boolean solve(ArrayList<ArrayList<Character>> a , int pos) {
			if(pos>=80) {
				return true;
			}
		
			int r = pos/9;
			int c = pos % 9;
			
			if(a.get(r).get(c) != '.') {
				solve(a,pos+1);
			}else {
				for(int i=1;i<=9;i++) {
					if((row[r][i-1] != 1) && (col[c][i-1] !=1) && (grid[r/3][c/3][i-1] !=1)){
						a.get(r).set(c,(char)('0'+i));
						row[r][i-1] = 1;
						col[c][i-1] = 1;
						grid[r/3][c/3][i-1] = 1;
						if(solve(a,pos+1)) {
							return true;
						}else {
							row[r][i-1] = 0;
							col[c][i-1] = 0;
							grid[r/3][c/3][i-1] = 0;
							a.get(r).set(c,'.');
						}
					}
				}
			}
			
			return false;
	}
}
