package com.basic.sorting;

import java.util.Arrays;

/*
 * Insertion sort
 * 1)select and insert into appropriate place until swap
 * 2)compare left with right if greater swap
 * 
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 13, 46, 24, 52, 20, 9 };
		insertionSort(arr);
	}

	public static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
//			int j=i;
//			while(j>0 && arr[j-1]>arr[j])
//			{
//				int temp=arr[j-1];
//				arr[j-1]=arr[j];
//				arr[j]=temp;
//				j--;
//			}
			for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
