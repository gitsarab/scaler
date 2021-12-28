package com.java.scaler.array;

import java.util.ArrayList;
import java.util.Collections;

public class ConstructArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int A = 27;
		int B = 20;
		int C = 50;
*/		
		int A = 6;
		int B = 2;
		int C = 18;
		
		/*int A = 7;
		int B = 2;
		int C = 6;*/
		
		
		int bigmax = Integer.MAX_VALUE;
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> factors = new ArrayList<Integer>();
        
        int diff = C-B;
        factors = getFactors(diff);
        int max = 0;
        int countleft=0;
        int countright=0;
        
        for(int i=0; i< factors.size();i++){
            res = new ArrayList<Integer>();
            res.add(C);
            diff = factors.get(i);
            System.out.println("Diff-"+diff);
            int nextele = 0;
            countleft = 1;
            countright = 0;
            while((countleft + countright) < A){
                nextele = C-(countleft*diff);
                if(nextele <= 0){
                	countright=1;
                	while((countleft + countright) <= A){
                		nextele = C + (countright*diff);
                		res.add(nextele);
                		countright++;
                	}
                	countright--;
                }
                else{
                    res.add(nextele);
                    countleft++;
                }
            }
            
/*            if(count<A){
            	nextele = 
            }
*/          System.out.println("res-"+res);
			System.out.println("----------------------------------------------------");
            if(((countleft + countright) == A) && res.contains(B)){
            	max = res.get(res.size()-1);
            	System.out.println("Max-"+max);
            	System.out.println("BigMax-"+bigmax);
            	System.out.println("------------------------");
            	if(max < bigmax){
            		bigmax = max;
            		result = new ArrayList<Integer>(res);
            	}
            }
            	
        }
        
        Collections.sort(result);
        
        System.out.println("Result-"+result);
        
    }
    
    static ArrayList<Integer> getFactors(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int num = n/i;
                factors.add(i);
                factors.add(num);
            }
        }
        
        Collections.sort(factors);
        return factors;
    }
}
