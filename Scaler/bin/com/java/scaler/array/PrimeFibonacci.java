package com.java.scaler.array;

public class PrimeFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("prime Count-"+solve(1,80));
	}

	static int solve(int A, int B) {

		 int count = 0;
	        
	        int a = 1;
	        int b = 1;
	        int c = 0;
	        
	        int[] fibarr = new int[61];
	        fibarr[0]=0;
	        fibarr[1]=1;
	        fibarr[2]=1;
	        int fibCnt = 3;
	        //int primecount
	        
	        while(fibCnt<=60){
	            c = a+b;
	            a = b;
	            b = c;
	            c = c%10;
	            
	            fibarr[fibCnt] = c;
	            
	            fibCnt++;
	        }
	        
	        int tot = B-A+1;
	        
	        A = A%60;
	        B = B%60;
	        
	        int val = 0;
	        for(int i=A;i<=B;i++){
	           val =  fibarr[i];
	            if(val==2 || val==3 || val == 5 || val==7)
	                count++;
	        }
	        
	        return count;
	}
}
