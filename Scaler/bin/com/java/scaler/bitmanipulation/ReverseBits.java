package com.java.scaler.bitmanipulation;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 3;
		System.out.println("Reverse of "+i+" is -"+reverse(i));
	}
	
	static long reverse(long a) {
		long rev = 0;
		for(int i=0;i<32;i++) {
			rev = rev << 1;
			if((a & (1<<i)) > 0) {
				rev = rev | 1;
			}
					
			
		}
		
		return rev;
		
	}

}
