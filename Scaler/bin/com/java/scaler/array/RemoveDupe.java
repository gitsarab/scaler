package com.java.scaler.array;

import java.util.ArrayList;

public class RemoveDupe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(2);
		int len =a.size();
		
		int j=0;
		for(int i=0;i<(len-1);i++){
			if(a.get(i) != a.get(i+1)){
				a.set(j++, a.get(i));
				//j++;
			}
		}
		
		a.set(j++, a.get(len-1));
		
		a.trimToSize();
		
		
		/*int[] arr = new int[]{1,1,2,3,3,3,4,5,5};
		
		int n =arr.length;
		
		for(int i=0;i<n-1;i++){
			if(arr[i] != arr[i+1]){
				arr[j++] =arr[i];
			}
		}
		
		arr[j++] =arr[n-1];
		
		System.out.println("arr-"+arr.toString());
		System.out.println("arr size-"+arr.length);*/
			
		/*int i =1;
		    while(i<a.size()){
		    	if(a.get(i).compareTo(a.get(i-1)) == 0){
		    		 a.remove(a.get(i-1));
		        }else{
		            i++;
		        }*/
		    	
		        /*if((a.get(i)) == (a.get(i-1))){
		            a.remove(a.get(i-1));
		        }else{
		            i++;
		        }*/
		    
		    System.out.println("a-"+a);
		    System.out.println("a size-"+a.size());
		   // return a.size();
		
	}

}
