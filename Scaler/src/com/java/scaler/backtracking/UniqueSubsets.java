package com.java.scaler.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class UniqueSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(1);
		//A.add(2);
		
		
		System.out.println("ret-"+subset(A));

	}
	
	static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> A) {
		Collections.sort(A);
		int n = A.size();
		
		HashSet<ArrayList<Integer>> ret = new HashSet<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> retarr = new ArrayList<ArrayList<Integer>>();
		
        if (A.size()==1){
        	ArrayList<Integer> arr = new ArrayList<Integer>();
        	ArrayList<Integer> arr1 = new ArrayList<Integer>();
        	arr.add(A.get(0));
        	retarr.add(arr1);
        	retarr.add(arr);
            return retarr;
        }
        
        
		int[] curr = new int[n];
		
		ret = generate(curr, A, 0,n,ret);
		retarr = new ArrayList<>(ret);
		//Collections.sort(ret);
		Collections.sort(retarr, new Comparator<ArrayList<Integer>>() { 
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) { 
                int min = Math.min(o1.size(),o2.size());
                for(int i=0;i<min;i++)
                {
                     if(o1.get(i)!=o2.get(i))
                     {
                         return o1.get(i).compareTo(o2.get(i));
                     }
                }
                return (o1.size()<=o2.size())? -1:1;                
            }
        }); 
		
		return retarr;
    }
	
	static HashSet<ArrayList<Integer>> generate(int[] curr, ArrayList<Integer> A, int index, int n, HashSet<ArrayList<Integer>> ret) {
		if(index == (n)) {
			ArrayList<Integer> n1 = new ArrayList<Integer>();
			for(int i=0;i<curr.length;i++) {
				if(curr[i]==1)
					n1.add(A.get(i));
			}
			ret.add(n1);
		}
		if(index<n) {
			curr[index] = 0;
			generate(curr,A,index+1,n,ret);
			curr[index] = 1;
			generate(curr,A,index+1,n,ret);
		}
		
	return ret;
	
}

}
