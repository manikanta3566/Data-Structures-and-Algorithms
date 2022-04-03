package com.dsa.sorting;

public class SelectionSort {
public static void main(String[] args) {
	int arr[]= {10,3,1,20,5};
	for(int i=0;i<arr.length;i++) {
		int iMin=i;
		for(int j=i+1;j<arr.length;j++) {		
			if(arr[j]<arr[iMin]) {
				iMin=j;
			}	
				int temp=arr[iMin];
				arr[iMin]=arr[i];
				arr[i]=temp;
	}
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}
}
