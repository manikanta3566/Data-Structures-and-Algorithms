package com.dsa.sorting;

public class InsertionSort {
public static void main(String[] args) {
	int arr[]= {10,3,1,20,5};
	for(int i=1;i<arr.length;i++) {
	int currentEle=arr[i];
	int j=i;
	while(j>0 && arr[j-1]>currentEle) {
		int temp=arr[j];
		arr[j]=arr[j-1];
		arr[j-1]=temp;
		j--;
	}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
}
}
