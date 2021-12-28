package com.java.scaler.maths;

public class DeleteOneMaxGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {7,21};
		
		int n=A.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = A[0];
        suff[n-1]=A[n-1];
        
        for(int i=1;i<n;i++){
            pref[i]= gcd(pref[i-1],A[i]);
        }
        for(int i=n-2;i>=0;i--){
            suff[i]= gcd(suff[i+1],A[i]);
        }
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(int i=0;i<n;i++){
            if(i==0)
                val = suff[i+1];
            else if(i==(n-1))
                val = pref[i-1];
            else
                val = gcd(pref[i-1],suff[i+1]);
                
            max = Math.max(val,max);
            
        }
        
        System.out.println("Max-"+max);
       // return max;
        
    }
    
    static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
