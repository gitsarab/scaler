package com.java.scaler.modulus;

import java.util.HashMap;

public class FantasticFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Count -"+solve(new int[] {3,3,3,3}));
	}
	
static int solve(int[] A) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%4!=0){
                if(map.containsKey(A[i])){
                    map.put(A[i],map.get(A[i])+1);
                }else{
                    map.put(A[i],1);
                }
            }
        }
        int oneCount=0, twoCount=0,threeCount=0;
        if(map.size() > 0){
            if(map.containsKey(1))
                oneCount=map.get(1);
            if(map.containsKey(2))
                twoCount=map.get(2);
            if(map.containsKey(3))
                threeCount=map.get(3);
                
            if((1 * oneCount + 2 * twoCount + 3 * threeCount) % 4 == 0){
                 count = count + (twoCount/2);
                 twoCount = twoCount%2;
                
                if((oneCount==threeCount)){
                    if(twoCount==0){
                        count = count + oneCount;
                        return count;
                    }else{
                        return -1;
                    }
                }else{
                    int temp = Math.min(oneCount,threeCount);
                 
                    count = count + temp;
    
                    oneCount = oneCount-temp;
                    threeCount = threeCount-temp;
    
                    if(oneCount==0){
                        if(twoCount==0){
                            if(threeCount%4==0){
                            	threeCount = threeCount/4;
                                count = count + (threeCount*3);
                            }else
                                return -1;
                        }else{
                            if(threeCount%4==0){
                                 return -1;
                            }else if(threeCount%4==2){
                                threeCount = threeCount -2;
                                threeCount = threeCount/4;
                                count = count + (threeCount*3) + 2;
                            }else{
                                return -1;
                            }
                        } 
                    }else{
                        if(twoCount==0){
                           if(oneCount%4==0){
                        	   oneCount = oneCount/4;
                                count = count + (oneCount*3);
                            }else
                                return -1; 
                        }else{
                            if(oneCount%4==0){
                                 return -1;
                            }else if(oneCount%4==2){
                                oneCount = oneCount -2;
                                oneCount = oneCount/4;
                                count = count + (oneCount*3) +2;
                                //count = count + (oneCount*(oneCount-1)/2) + 2;
                            }else{
                                return -1;
                            }
                        }
                    }              
                }
            }else
                return -1;
        }
      
        if(count>0)
        	return count;
        
            return -1;
    }

}
