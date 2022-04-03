//Print all unique subsequences
package com.dsa.recursion;

import java.util.HashSet;

public class Recursion8 {
	static void uniqueSubsequences(String str,int index,String newstring,HashSet<String> set ) {
	if(index==str.length()) {
		if(set.contains(newstring)) {
			return;
		}else {
			System.out.println(newstring);
			set.add(newstring);
			return;
		}
	}
		char cuurentChar=str.charAt(index);
	//to be include
	uniqueSubsequences(str, index+1, newstring+cuurentChar, set);
	//to be not include
	uniqueSubsequences(str, index+1, newstring, set);
	}
	
public static void main(String[] args) {
	String str="aaa";
	HashSet<String> set=new HashSet<String>();
	uniqueSubsequences(str, 0, "", set);
	
}
}
