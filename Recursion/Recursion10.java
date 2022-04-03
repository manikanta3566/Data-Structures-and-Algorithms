//print permutations of string
package com.dsa.recursion;

public class Recursion10 {
	    static  void permutation(String str,String permutation){

	        if(str.length()==0){
	            System.out.println(permutation);
	            return;
	        }
	         for (int i=0;i<str.length();i++){
	            char cuurentChar=str.charAt(i);
	            String newString=str.substring(0,i)+str.substring(i+1);
	            permutation(newString,permutation+cuurentChar);
	        }
	    }
	    public static void main(String[] args) {
	        String str="abc";
	        permutation(str,"");

	    }
	
}
