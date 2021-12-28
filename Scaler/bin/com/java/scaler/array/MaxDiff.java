package com.java.scaler.array;

import java.util.ArrayList;
import java.util.Collections;

public class MaxDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A =new ArrayList<Integer>();
		/*
		A.add(70);
		A.add(21);
		A.add(7);
		A.add(64);
		A.add(44);
		
		A.add(79);
		A.add(50);
		A.add(89);
		A.add(68);
		A.add(23);
		
		A.add(20);
		A.add(50);
		A.add(65);
		A.add(64);
		A.add(48);
		
		A.add(3);
		A.add(46);
		A.add(87);
		*/
		
		A.add(93);
		A.add(51);
		A.add(84);
		A.add(81);
		A.add(89);
		
		A.add(82);
		A.add(28);
		A.add(78);
		A.add(86);
		A.add(35);
		
		A.add(64);
		A.add(38);
		A.add(49);
		A.add(99);
		A.add(83);
		
		//int B =16;
		int B =4;
		
		Collections.sort(A);
		System.out.println("Array-"+A);
        int s1 =0;
        int sum = 0;
        for(int i=0;i<A.size();i++){
        	sum+=A.get(i);
        }
        int len = A.size();
        System.out.println("sum-"+sum);
        int s2 = 0;
        for (int i=0;i<B;i++){
            s1+=A.get(i);
        }
        s2=sum-s1;
        int max = Math.abs(s1-s2);
        
        System.out.println("s1-"+s1);
        System.out.println("s2-"+s2);
        System.out.println("max-"+max);
        
        System.out.println("----------------------");
        
        for(int i=B;i<len;i++){
        	s1 = s1 + A.get(i) - A.get(i-B);
        	s2=sum-s1;
        	if(Math.abs(s1-s2) > max){
        		max = Math.abs(s1-s2);
        	}
        	
        	 System.out.println("----------------------");
        }
        
        
       System.out.println("Max-"+max);

	}

}
