// Print string in reverse
package com.dsa.recursion;

public class Recursion2 {
	public static void reverseString(String str,int l) {
		if(l==0) {
			System.out.println(str.charAt(l));
			return;
		}
		System.out.print(str.charAt(l));
		reverseString(str, l-1);
	}
	public static void main(String[] args) {
		String str="abcd";
		int l=str.length();
		reverseString(str,l-1);
	}

}
