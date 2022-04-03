//Print all subsequences
package com.dsa.recursion;

public class Recursion7 {
	static void subsequences(String str,int index,String newstring) {
		if(index==str.length()) {
			System.out.println(newstring);
			return;
		}
		char currentChar=str.charAt(index);
		//to be include
		subsequences(str, index+1, newstring+currentChar);
		
		//to be not include
		subsequences(str, index+1, newstring);
	}
	
public static void main(String[] args) {
	String str="abc";
	subsequences(str, 0, "");
}
}
