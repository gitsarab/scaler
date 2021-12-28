package com.java.scaler.array;

public class ArrayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
		int[] B = new int[] { 88, 85, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 };
		
		int[][] resarr = solve(A,B);
		//System.out.println("Result -"+solve(A,B));
		
		for(int i =0;i<B.length;i++){
			
			for(int j=0; j<A.length;j++){
				System.out.print(resarr[i][j]);
				System.out.print(" ");
			}
			System.out.println(",");
		}

	}

	public static int[][] solve(int[] A, int[] B) {

		int swap = 0;
		int alen = A.length;
		int[] revarr = new int[alen];
		int counter = 0;

		int[][] retarr = new int[B.length][alen];
		int rotval = 0;

		for (int j = 0; j < (alen / 2); j++) {
			swap = A[j];
			A[j] = A[(alen - 1) - j];
			A[(alen - 1) - j] = swap;
		}
		
		System.out.println("A length-"+alen);
		for (int i = 0; i < B.length; i++) {
			System.out.println("Given B-"+ B[i]);
			if(B[i] > A.length)
				rotval = B[i]%A.length;
			else
				rotval = B[i];
			System.out.println("Rotation B-"+ rotval);
			counter = 0;
			for (int m = (rotval); m <= ((rotval) + ((alen-rotval )/ 2)); m++) {
				swap = A[m];
				revarr[m] = A[(alen - 1) - counter];
				revarr[(alen - 1) - counter] = swap;
				counter++;
			}
			for (int n = 0; n <= rotval / 2; n++) {
				swap = A[n];
				revarr[n] = A[rotval-1 - n];
				revarr[rotval-1-n] = swap;
			}

			for (int k = 0; k < alen; k++) {
				retarr[i][k] = revarr[k];
			}

		}

		return retarr;

	}
}