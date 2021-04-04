package com.java.scaler.adhoc;

import java.util.HashMap;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		String str = "abb_c";
		
		String[] strarr = str.split("_");
		
		//String s1 = descOrder(strarr[0]);
		String s1 = (strarr[0]);
		String s2 = descOrder(strarr[1]);
		
		System.out.println("s1,s2"+s1+"-"+s2);
		
		char[] cS = s1.toCharArray();
		char[] cT = s2.toCharArray();
				
		int j=0;
		boolean isreplaced = false;
		for(int i=0;i<cS.length;i++){
			if(isreplaced)
				j++;
			isreplaced = false;
			
			for(;j<cT.length;j++){
				if(cT[j]>cS[i]){
					cS[i] = cT[j];
					isreplaced = true;
					break;
				}else
					break;
			}
		}
		
		String retstr =new String(cS);
		System.out.println("string-"+retstr);
		
	}
	
	    
	public static String descOrder(String s){
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		s = new String(ch);
		System.out.println("incoming s"+s);
		String str = new String();
		for(int i=(s.length()-1); i>=0;i--){
			str =str+s.charAt(i);
		}
		
		System.out.println("desc order-"+str);
		return str;
		*/
		
		
		//List<Integer> A = new ArrayList<Integer>();
		/*A.add(30);
		A.add(300);
		A.add(34);
		A.add(5);
		A.add(9);*/
		/*A.add(2);
		A.add(3);
		A.add(9);
		A.add(0);
		*/
		/*A.add(0);
		A.add(0);
		A.add(0);*/
		
		/*ArrayList<String> arrList = new ArrayList<String>();
		for(int i=0;i<A.size();i++){
			arrList.add(String.valueOf(A.get(i)));
		}
		
		Collections.sort(arrList);
		String output ="";
		int val = 0;
		
		for(int j=(arrList.size()-1);j>=0;j--){
			val = Integer.parseInt(arrList.get(j));
			if((val%10 == 0) && (j!=0) && (Integer.parseInt(arrList.get(j-1)) == (val/10) )){
				output = output + arrList.get(j-1);
				output = output + arrList.get(j);
				j--;
			}else
				output = output + arrList.get(j);
		}
		
		System.out.println("Output -"+output);*/
		
		/* StringBuffer strBuf = new StringBuffer();
		    Node num[];
		    int i = 0;
		    
		    num = new Node[A.size()];
		    
		    for (int n : A) {
		        num[i] = new Node(n);
		        i++;
		    }
		    
		    Arrays.sort(num);
		    
		    for (Node n : num) {
		        if (n.number == 0 && strBuf.length() != 0)
		            continue;
		        strBuf.append(n.number);
		    }*/

		    
		   // return strBuf.toString();
		
		//int[] a = new int[]{51, 6, 10, 8, 22, 61, 56, 48, 88, 85, 21, 98, 81, 76, 71, 68, 18, 6, 14, 23, 72, 18, 56, 30, 97, 100, 81, 5, 99, 2, 85, 67, 46, 32, 66, 51, 76, 53, 36, 31, 81, 56, 26, 75, 69, 54, 54, 54, 83, 41, 86, 48, 7, 32, 85, 23, 47, 23, 18, 45, 79, 95, 73, 15, 55, 16, 66, 73, 13, 85, 14, 80, 39, 92, 66, 20, 22, 25, 34, 14, 51, 14, 17, 10, 100, 35, 9, 83, 31, 60, 24, 37, 69, 62};
		/*int[] a = new int[]{ 847, 350, 392, 572, 592, 415, 282, 190, 608, 501, 491, 880, 579, 47, 258, 977, 593, 282, 491, 77, 532, 987, 309, 999, 740, 735, 322, 823, 149, 514, 874, 558, 7, 178, 964, 38, 227, 927, 299, 262, 914, 622, 675, 490, 355, 154, 392, 957, 703, 217, 648, 758, 456, 433, 119, 784, 563, 876, 700, 851, 698, 126, 406, 266, 150, 746, 883, 369, 859, 717, 848, 160, 98, 869, 58, 792, 172, 80, 974, 522, 738, 159, 407, 917, 397, 458, 687, 838, 506, 83, 116, 967, 779, 698, 877, 739, 321, 573, 257, 716, 413, 57, 135, 342, 860, 17, 820, 675, 182, 752, 674, 62, 43, 127, 412, 663, 81, 494, 399, 586, 48, 78, 498, 802, 201, 164, 332, 371, 540, 677, 754, 321, 195, 952, 334, 801, 628, 486, 455, 520, 164, 259, 616, 326, 339, 202, 711, 62, 443, 696, 633, 591, 507, 26, 853, 402, 359, 363, 177, 489, 484, 537, 630, 381, 253, 184, 438, 925, 635, 219, 168, 880, 2, 65, 253, 923, 30, 775, 206, 382, 436, 844, 904, 556, 144, 329};
		
		System.out.println("size-"+a.length);
		
		int count = 0;
		int diff = 0;
		Arrays.sort(a);
		
		for(int i=1;i<a.length;i++){
			if(a[i] == a[i-1]){
				a[i] = a[i] +1;
				count++;
			}else if (a[i] < a[i-1]){
				diff = a[i-1] - a[i];
				a[i] = a[i]+diff+1;
				count = count+ diff+1;
			}
		}
		
		System.out.println("count-"+count);
		
		}*/
		
//		String A = "abc";
//		String B = "abcbacabc";
		
		String A = "p";
		String B = "pccdpeeooadeocdoacddapacaecb";
		
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        int len = A.length();
        
        for (int i=0; i<len;i++){
            if(hMap.containsKey(Character.toString(A.charAt(i))))
                hMap.put(Character.toString(A.charAt(i)), hMap.get(Character.toString(A.charAt(i))) + 1);
            else
                hMap.put(Character.toString(A.charAt(i)),1);
        }
        
        int count = 0;
        
        for(int j=0;j<len;j++){
            if(map.containsKey(Character.toString(A.charAt(j))))
                map.put(Character.toString(A.charAt(j)), map.get(Character.toString(A.charAt(j))) + 1);
            else
                map.put(Character.toString(A.charAt(j)),1);
        }
        
        if(compareHashMap(hMap,map))
            count++;
        
        for(int k=len;k<B.length();k++){
            map.put(Character.toString(B.charAt(k-len)), map.get(Character.toString(B.charAt(k-len))) - 1);
            
            if(map.containsKey(Character.toString(B.charAt(k))))
                map.put(Character.toString(B.charAt(k)), map.get(Character.toString(B.charAt(k))) + 1);
            else
                map.put(Character.toString(B.charAt(k)),1);
            
            if(compareHashMap(hMap,map))
            count++;   
            
        }
        
        System.out.println("count-"+count); ;
	}
	
	
	public static boolean compareHashMap(HashMap<String, Integer> map1, HashMap<String, Integer> map2){
        //return map1.equals(map2);
		return map2.entrySet().containsAll(map1.entrySet());
    }

}
class Node implements Comparable<Node> {
    
    int number;
    
    public Node(int number) {
        this.number = number;
    }
    
    @Override
    public int compareTo(Node o) {
        String first = String.valueOf(this.number) + String.valueOf(o.number);
        String second = String.valueOf(o.number) + String.valueOf(this.number);
        
        return second.compareTo(first);
    }
    
}
