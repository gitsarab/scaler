package com.java.scaler.array;

import java.util.HashMap;

public class ExcelColumn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		
//		int A = 468096;
//		int A = 838674;
		int A = 924837;
//		int A = 47;
		
		A=78;
		
		hMap.put(1,"A");
		hMap.put(2,"B");
		hMap.put(3,"C");
		hMap.put(4,"D");
		hMap.put(5,"E");
		hMap.put(6,"F");
		hMap.put(7,"G");
		hMap.put(8,"H");
		hMap.put(9,"I");
		hMap.put(10,"J");
		hMap.put(11,"K");
		hMap.put(12,"L");
		hMap.put(13,"M");
		hMap.put(14,"N");
		hMap.put(15,"O");
		hMap.put(16,"P");
		hMap.put(17,"Q");
		hMap.put(18,"R");
		hMap.put(19,"S");
		hMap.put(20,"T");
		hMap.put(21,"U");
		hMap.put(22,"V");
		hMap.put(23,"W");
		hMap.put(24,"X");
		hMap.put(25,"Y");
		hMap.put(26,"Z");
		hMap.put(0,"Z");
		
		// String alpha = new String();
	        int rem = 0;
	        String title = "";
//	        boolean isfound = false;
	       /* if(A>26 && A%26==0){
	        	title ="Z";
	        	A = A-26;
	        	isfound = true;
	        }*/
	        
	        while(A>0){
	        	//if(isfound){
	        	if(A>=26 && A%26==0){
		        	title ="Z" + title;
		        	A = A-26;
		        }else{
	        		rem = A%26;
	        		title = hMap.get(rem)+title;
		        }
	        	//}
	        	//isfound = false;
	        	A/=26;
	        	System.out.println("title-"+title);
	        	System.out.println("A-"+A);
//	        	if(A==1)
//	        		break;
//	        	if(A==26){
//	        		title = "Z" + title;
//	        		break;
//	        	}
	        }
	        
		    System.out.println("Final Title-"+title);    

	}

}
