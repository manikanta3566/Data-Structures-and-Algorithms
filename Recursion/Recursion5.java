//Move all 'x' to the end in the string
package com.dsa.recursion;

public class Recursion5 {
	public static void moveX(String str,int count,String newstring,int index){
		if(index==str.length()-1) {
			for(int i=0;i<count;i++) {
				newstring+='x';
			}
			System.out.println(newstring);
			return;
		}
		
		char currentChar=str.charAt(index);
		if(currentChar=='x') {
			count++;
			moveX(str, count, newstring, index+1);
		}else {
			newstring+=currentChar;
			moveX(str, count, newstring, index+1);
		}
	}
	
public static void main(String[] args) {
	String str="axabcab";
	moveX(str,0,"",0);
}
}
