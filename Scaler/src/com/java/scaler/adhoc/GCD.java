package com.java.scaler.adhoc;

public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
    
    static int substract(int A,int B){
        A = A - B;
        int temp=0;
        if(A<B){
            temp = A;
            B = A;
            A = B;
        }
        if(A == B || A ==0 || B ==0)
            return A + B;
        
        return substract(A,B);
    }

}
