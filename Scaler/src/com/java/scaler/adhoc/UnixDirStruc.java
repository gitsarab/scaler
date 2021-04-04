package com.java.scaler.adhoc;

import java.util.Scanner;
import java.util.Stack;

public class UnixDirStruc {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the directory : ");
		String str = sc.nextLine();
		
		//String str = "/a/./b/./c/./d/";
		//String str = "/x/y/z//a/./b/../../c/";
		System.out.println("Path-"+simplifyPath(str));

	}
	
	static String simplifyPath(String A){
		StringBuilder res = new StringBuilder("/");
		
		Stack<String> st = new Stack<String>();
		
		int len =A.length();
		
		for(int i=0;i<len;i++){
			
			String dir = "";
			
			while(i<len && A.charAt(i) == '/')
				i++;
			
			while(i<len && A.charAt(i) != '/'){
				dir = dir + A.charAt(i);
				i++;
			}
			
			if(dir.equalsIgnoreCase("..")){
				if(!st.empty()){
					st.pop();
				}
			}else if(dir.equalsIgnoreCase(".")){
				continue;
			}else if(dir.length()>0){
				st.push(dir);
			}
		}
		
		//Stack<String> st1 = new Stack<String>();
		int n = st.size();
		int i = 0;
		while(i<n){
		//	st1.push(st.pop());
			if(i< (n-1))
				res.append(st.get(i)).append("/");
			else
				res.append(st.get(i));
			
			i++;
		}
		
		/*while(!st1.empty()){
			if (st1.size() != 1)
                res += (st1.pop() + "/");
            else
                res += st1.pop();
		}*/
		
		return res.toString();
	}

}
