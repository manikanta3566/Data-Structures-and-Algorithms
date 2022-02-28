//Check the array is sorted or not(Strictly increasing)
package com.dsa.recursion;

public class Recursion4 {
	public static boolean sortArr(int[] arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		if(arr[index]<arr[index+1]) {
			return sortArr(arr, index+1);
		}else {
			return false;
		}
		
	}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,4};
	System.out.println(sortArr(arr, 0)); 
}
}
