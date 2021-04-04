package com.java.scaler.array;

import java.util.ArrayList;
import java.util.Stack;

public class MergeInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interval in1 = new Interval(1,2);
		Interval in2 = new Interval(3,6);
//		Interval in3 = new Interval(4,8);
//		Interval in4 = new Interval(1,7);
//		Interval in5 = new Interval(5,6);
//		Interval in6 = new Interval(6,12);
		
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(in1);
		intervals.add(in2);
//		intervals.add(in3);
//		intervals.add(in4);
//		intervals.add(in5);
//		intervals.add(in6);
		
		Interval newInterval = new Interval(10,8);
		
		System.out.println("Insert-"+insert(intervals, newInterval));
		
	}
	
	static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        ArrayList<Interval> retList = new ArrayList<Interval>();
        Stack<Interval> stack =new Stack<Interval>(); 
        
        if(newInterval.start>newInterval.end){
        	newInterval = new Interval(newInterval.end, newInterval.start);
        }
        
        int n =intervals.size();
        boolean isAdded = false;
       
        int i=0;
        
        if(newInterval.start < intervals.get(0).start){
        	stack.push(newInterval);
        	isAdded = true;
        }else{
        	stack.push(intervals.get(0));
        	Interval top = stack.peek();
        	if(top.end > newInterval.start){
        		top.end = newInterval.end;
        		stack.pop();
        		stack.push(top);
        		isAdded = true;
        	}
        	i=1;
        }
        
        for(;i<n;i++){
        	Interval top = stack.peek();
      		 Interval in = intervals.get(i);
      		if(isAdded){
	        		 if(top.end < in.start){
	             		stack.push(in);
	             	}else{
	             		top.end = in.end;
	             		stack.pop();
	             		stack.push(top);
	             	}
      		}else{
      			if(top.end > newInterval.start){
              		top.end = newInterval.end;
              		stack.pop();
              		stack.push(top);
              		isAdded = true;
              	}else{
              		if(top.end < intervals.get(i).start){
                        stack.push(intervals.get(i));
                    }else if(top.end < intervals.get(i).end){
                        top.end = intervals.get(i).end;
                        stack.pop();
                        stack.push(top);
                    }
              	}
      		}
      	}
        
        if(!isAdded){
        	Interval top =stack.peek();
        	if(top.end< newInterval.start){
        		stack.push(newInterval);
        	}else{
        		top.end = newInterval.end;
         		stack.pop();
         		stack.push(top);
        	}
        }
        
        int count = 0;
        while(count<stack.size()){
            Interval in = stack.get(count);
            retList.add(in);
            count++;
        }

        return retList;
    }

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

}
