//Find first & last occurrence of element
package com.dsa.recursion;

public class Recursion3 {
	public static int first=-1;
	public static int last=-1;
	public static void printOcc(String str,int index,char element) {
		if(index==str.length()){
			System.out.println(first);
			System.out.println(last);
			return;
		}
	char currElement=element;
	if(currElement==element) 
		if(first==-1) {
		first=index;	
	}else {
		last=index;
	}
	printOcc(str, index+1, currElement);
	}
	public static void main(String[] args) {
		String str="aabbbccaaba";
		printOcc(str,0,'a');
		
	}
}
