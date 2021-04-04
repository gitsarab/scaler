package com.java.scaler.array;

import java.util.ArrayList;

public class MergeOverlappingIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1, 10), (2, 9), (3, 8), (4, 7), (5, 6), (6, 6)
		// [1,3],[2,6],[8,10],[15,18]
		Interval in1 = new Interval(2,10);
		Interval in2 = new Interval(3,9);
		Interval in3 = new Interval(4,8);
		Interval in4 = new Interval(1,7);
		Interval in5 = new Interval(5,6);
		Interval in6 = new Interval(6,12);
		
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		intervals.add(in5);
		intervals.add(in6);
		
		System.out.println("Merge-"+merge(intervals));
		
		
	}
	
	static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        
        ArrayList<Interval> retList = new ArrayList<Interval>();
        int n=intervals.size();
        boolean isOverlap = false;
        Interval in1 = new Interval(intervals.get(0).start, intervals.get(0).end);
        int start1 = in1.start;
        int end1 = in1.end;
        
        int count=1;
        int min = start1;;

        Interval in2 = null;
        Interval in = null;
        for(int i=1;i<n;i++){
            in2 = new Interval(intervals.get(i).start, intervals.get(i).end);
    		// (1, 10), (2, 9), (3, 8), (4, 7), (5, 6), (12, 6)

            System.out.println("1-"+in1.start+"-"+in1.end);
            System.out.println("2-"+in2.start+"-"+in2.end);
            
            int start2 = in2.start;
            int end2 = in2.end;
            
            min = Math.min(min,start2);
            	
            if(start2<=end1){
            	count++;
            	//continue;
            }else{
            	
            	Interval previn = new Interval(intervals.get(i-1).start, intervals.get(i-1).end); 
            	if(previn.end <= end1){
            		in = new Interval(min, end1);
            	}else{
            		in = new Interval(min, previn.end);
            	}
            	
                System.out.println("in-"+in);
                retList.add(in);
             
                in1 = new Interval(intervals.get(i).start, intervals.get(i).end);
                start1 = in1.start;
                end1 = in1.end;
                
                min = start1;
                
                isOverlap  =true;
                count ++;
            }
            
            if(count == n && !isOverlap){
            	//start1 = intervals.get(0).start;
            	if(end2>end1)
            		end1 = end2;
            	
            	retList.add(new Interval(min,end1));
            }else if(count == n && isOverlap){
            	if(end2>end1)
            		end1 = end2;
            	retList.add(new Interval(min,end1));
            }
            
            System.out.println("--------------------------");
        }
        
        /*if(!isOverlap){
            retList.add(new Interval(intervals.get(0).start, intervals.get(0).end));
        }else{
        	retList.add(new Interval(start1,end1));
        }*/
        
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
