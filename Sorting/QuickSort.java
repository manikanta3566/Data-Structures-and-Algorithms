package com.dsa.sorting;

public class QuickSort {
	static int partition(int arr[],int low,int high) {
		int i=low-1;
		 int pivot=arr[high];
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				//swap
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[i]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
		
	}
	static void quicksort(int arr[],int low,int high) {
		if(low<high) {
			int pivotIdx=partition(arr,low,high);
			quicksort(arr, low,pivotIdx-1);
			quicksort(arr, pivotIdx+1, high);
		}
	}
	
public static void main(String[] args) {
	int arr[]= {10,5,2,20,2};
	quicksort(arr, 0, arr.length-1);
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[i]);
	}
}
}
