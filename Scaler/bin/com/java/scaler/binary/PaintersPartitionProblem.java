package com.java.scaler.binary;

public class PaintersPartitionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 2;
		int B = 1;
		int[] C = new int[] {4, 8, 11, 6};
		
		
		 long  mod = 10000003;
		    int n = C.length;
				long sum = 0;
				long max = 0;
				for(int i=0;i<n;i++) {
				//	C[i] = C[i] * B;
					sum+=C[i];
					max = Math.max(max, C[i]);
				}
				
				if(A >= n) {
					System.out.println("Ans-"+max);
					//return (int) (max * B % mod);
				}
				long l = max;
				long r = sum;
				long ans = Integer.MAX_VALUE;
				
				while(l<=r) {
					long mid = l + (r-l)/2;
					/*if(noOfPainters(C, mid) == A) {
						System.out.println("Ans-"+mid);
						return;
					}else */
						if(noOfPainters(C, mid) <= A) {
						ans = Math.min(ans, mid);
						r = mid-1;
					}else
						l = mid +1;
					
				}
				
			//	System.out.println("Ans-"+ans);
			
			//return (int) (ans * B % mod);

			}
			
			static int noOfPainters(int[] A, long T) {
				int count = 0;
				long sum = 0;
				for(int i=0;i<A.length;i++) {
					if((sum+A[i]) > T) {
						count ++;
						sum = A[i];
					}else {
						sum = sum + A[i];
					}
						
				}
				
				if(sum<=T) 
					count++;
				
				return count;
			}

}
