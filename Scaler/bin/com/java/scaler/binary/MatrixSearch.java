package com.java.scaler.binary;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A = new int[4][5];
		int count = 1;
		for(int i = 0; i< 4;i++) {
			for (int j=0;j<5;j++) {
				A[i][j] = count * 2;
				count ++;
			}
		}
		
		System.out.println("matric search-"+matrixSearch(A, 37));
		
	}
	
	static int matrixSearch(int[][] A, int B) {
		
		
		int m = A.length;
		int n = A[0].length;
		
		if(A[0][0] > B || A[m-1][n-1] < B)
			return 0;
		
		int t = 0;
		int b = A.length - 1;
		
		int mid = 0;;
		
		while (t <=b) {
			mid = (t+b)/2;
			
			if(A[mid][0] > B )
				b = mid - 1;
			else if(A[mid][n-1] < B)
				t = mid +1;
			else if (A[mid][0] == B || A[mid][n-1] == B )
				return 1;
			else if (A[mid][0] < B && A[mid][n-1] > B )
				break;
		}
		
		int l = 0, r = n-1;
		
		int c= 0;
		while(l<=r) {
			c = (l+r)/2;
			if(A[mid][l] > B )
				r = c - 1;
			else if(A[mid][c] < B)
				l = mid +1;
			else if (A[mid][c] == B)
				return 1;
		}
		
		return 0;
	}

}
