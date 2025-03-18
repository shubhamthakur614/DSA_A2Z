package com.string;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 7, 4, 6, 1 };
		System.out.println(Arrays.toString(arr));
//	 		bubbleSort(arr);
//		insertionSort(arr);
//		selectionSort(arr);
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				swap(arr, j, j - 1);
				j--;
			}
		}
	}
	
	public static void selectionSort(int []arr) {
			
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			swap(arr,min,i);
			
		}
		
	}
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void mergeSort(int[] arr) {
		
	}

}
