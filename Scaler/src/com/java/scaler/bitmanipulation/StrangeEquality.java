package com.java.scaler.bitmanipulation;

public class StrangeEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 1;
		int n=0;
		for(int i=31;i>=0;i--) {
			if((A & (1<<i)) == (1<<i)) {
				n=i;
				break;
			}
		}

		int X = 0;
		for(int i=0;i<n;i++) {
			if((A & (1<<i)) == 0) {
				X = X | (1<<i);
			}
				
		}
		System.out.println(X);
		//System.out.println(i);
		
		int Y = 1;
		
		while(Y<=A) {
			Y*=2;
		}
			
		System.out.println(Y);
		
		System.out.println(X^Y);
	}

}
