package com.sorting;

import java.util.Arrays;

/*
 * Worst case when we have choose the pivot as the first and last element and lowest and 
 * smallest element will be at first and last place in 
 * that case it will worst case in the quick sort but it happen very rearly
 * worst case time complexity O(n^2)
 * AVG time complexity O(n^2)
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 5, 2, 8 };
//		int[] arr = { 3, 2, 7, 4, 6, 1 };
		System.out.println(Arrays.toString(arr));
		quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	public static void quicksort(int[] arr, int low, int high) {

		if (low < high) {
			int pivotIdx = partion(arr, low, high);
			quicksort(arr, low, pivotIdx - 1);
			quicksort(arr, pivotIdx + 1, high);
		}
	}

	public static int partion(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}

}
