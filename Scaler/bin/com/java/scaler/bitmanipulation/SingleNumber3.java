package com.java.scaler.bitmanipulation;

public class SingleNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solve-"+solve(new int[] {1,2,3,4,1,2,7,3}));

	}
	
	static int[] solve(int[] A) {
		
		int XOR = 0;
		for(int i=0;i<A.length;i++) {
			XOR^=A[i];
		}
		int j=0;
		for(;j<32;j++) {
			if((XOR & (1<<j)) >0)
				break;
		}
		int XOR1 = 0;
		int XOR2 = 0;
		for(int i=0;i<A.length;i++) {
			if((A[i] & (1<<j)) > 0)
				XOR1^=A[i];
			else
				XOR2^=A[i];
		}
		
		return new int[]{Math.min(XOR1, XOR2),Math.max(XOR1, XOR2)};
    }

}
