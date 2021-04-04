package com.java.scaler.bitmanipulation;

public class SingleNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("SingleNumber-"+singleNumber(new int[] {0,0,0,1}));
	}

	static int singleNumber(final int[] A) {

		int num = 0;
		int count = 0;

		for (int i = 0; i < 32; i++) {
			count = 0;
			for (int j = 0; j < A.length; j++) {
				if ((A[j] & (1 << i)) > 0) 
					count++;
			}
			
			if(count%3==1)
				num = num | (1<<i);

		}

		return num;
	}

}
