package com.java.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class CountRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1, 1, 2, 2};
		int[] b = new int[] {1, 2, 1, 2};
		
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			A.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			B.add(b[i]);
		}
		
		System.out.println("Answer :"+solve(A, B));
	}
	
	static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Pair,Integer> map = new HashMap<Pair, Integer>();
        int n= A.size();
        for(int i=0;i<n;i++){
            map.put(new Pair(A.get(i),B.get(i)),1);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A.get(i) != A.get(j) && B.get(i) != B.get(j)){
                    Pair p1 = new Pair(A.get(i),B.get(j));
                    Pair p2 = new Pair(A.get(j),B.get(i));
                    if(map.containsKey(p1) && map.containsKey(p2)){
                        count++;
                    }
                }
            }
        }
        
        return count/2;
    }

}
class Pair{
    
    int x;
    int y;
    
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
