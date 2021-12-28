package com.java.scaler.array;

public class SubarrayOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = new int[]{347148, 221001, 394957, 729925, 276769, 40726, 552988, 29952, 184491, 146773, 418965, 307, 219145, 183037, 178111, 81123, 109199, 683929, 422034, 346291, 11434, 7327, 340473, 316152, 364005, 359269, 170935, 105784, 224044, 22563, 48561, 165781, 9329, 357681, 169473, 175031, 605611, 374501, 6607, 329965, 76068, 836137, 103041, 486817, 195549, 107317, 34399, 56907, 37477, 189690, 36796, 376663, 39721, 177563, 174179, 183646, 217729, 408031, 429122, 631665, 282941, 526797, 262186, 306571, 63613, 57501, 70685, 226381, 1338, 9360, 130360, 20300, 400906, 87823, 180349, 108813, 18181, 119185, 1, 102611, 63591, 12889, 311185, 383896, 8701, 76077, 75481, 386017, 153553, 304913, 383455, 105948, 142885, 1, 12610, 137005, 119185, 16948, 66171, 123683};
		
		
		int n = A.length;
		int max_ele = Integer.MIN_VALUE;
		int mod = 1000000007;
		
		for(int i=0;i<n;i++){
			max_ele = Math.max(max_ele, A[i]);
		}
		//max_ele = 4096;
		
		System.out.println("N-"+n);
		System.out.println("Max_Ele-"+max_ele);
		int bits =0;
		int pow2 = 2;
		while (max_ele > 0){
			max_ele/=pow2;
			//pow2*=2;
			bits++;
		}
		
		System.out.println("No of bits-"+bits);
		
		long max_sum=0;
		pow2 =1;
		for(int i=0;i<bits;i++){
			max_sum = (int) (max_sum + (1 * Math.pow(2, i))) ;
		}
		
		System.out.println("Max value for bits-"+max_sum);
		
		max_sum  = max_sum * (n*(n+1)/2);
		System.out.println("Toal Sum-"+max_sum);
		
		int cont_zero = 0;
		for(int i=0;i<bits;i++){
			cont_zero = 0;
			for(int j=0;j<n;j++){
				if((A[j] & (1<<i)) == 0){
					cont_zero++;
				}else{
					max_sum = (max_sum - (long)(Math.pow(2,i) * (cont_zero*(cont_zero+1)/2)) )  ;
					cont_zero=0;
				}
				//A[j]>>=1;
			}
			max_sum = (max_sum - (long)(Math.pow(2,i) * (cont_zero*(cont_zero+1)/2)));
		}
		
		System.out.println("Max_Sum-"+max_sum);
		System.out.println("Max_Sum Mod-"+max_sum%mod);

	}

}
