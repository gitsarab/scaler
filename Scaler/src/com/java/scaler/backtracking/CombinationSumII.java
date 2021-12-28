package com.java.scaler.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class CombinationSumII {

	//private static HashSet<ArrayList<Integer>> retarr = new HashSet<ArrayList<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>();
		/*A.add(10);
		A.add(1);
		A.add(2);
		A.add(7);
		A.add(6);
		A.add(1);
		A.add(5);*/
		
		int[] AA = new int[] {15, 8, 15, 10, 19, 18, 10, 3, 11, 7, 17 };
		for(int i=0;i<AA.length;i++) {
			A.add(AA[i]);
		}
		int B = 33;
		
		
		System.out.println("Val-"+combinationSum(A,B));

		//10, 1, 2, 7, 6, 1, 5
	}

	private static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
	
		Collections.sort(A);
		HashSet<ArrayList<Integer>> retarr = new HashSet<ArrayList<Integer>>();
		LinkedList<Integer> sumarr = new LinkedList<Integer>();
		solve(0,A,B,0,sumarr,retarr);
		
		ArrayList<ArrayList<Integer>> resultArr = new ArrayList(retarr);
		
		Collections.sort(resultArr, new Comparator<ArrayList<Integer>>() { 
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
		
		return resultArr;
	}
	
	private static void solve(int index, ArrayList<Integer> A, int B, int sum, LinkedList<Integer> sumarr, HashSet<ArrayList<Integer>> retarr){
		if(sum > B) {
			return;
		} else if(sum == B) {
			retarr.add(new ArrayList<Integer>(sumarr));
			//return;
		}else {
			for(int i=index;i<A.size();i++) {
				sumarr.addLast(A.get(i));
				solve(i+1,A,B,sum+(A.get(i)),sumarr,retarr);
				sumarr.removeLast();
			}
		}
	}
}
