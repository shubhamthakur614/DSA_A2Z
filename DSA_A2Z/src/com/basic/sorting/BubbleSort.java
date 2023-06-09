package com.basic.sorting;

import java.util.Arrays;

/*
 * Bubble Sort
 * 1)In bubble sort the larger element is place at end of list first
 * 2)compare adjacent element and swap from 0 - n-1
 * 3)if in first iteration no element is swap that means array is sorted in ascending order
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 13, 46, 24, 52, 20, 9 };
		bubbleSort(arr);
	}

	public static void bubbleSort(int[] arr) {

		// largest element is place at last of the list by adjacent swapping
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean swapped = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
