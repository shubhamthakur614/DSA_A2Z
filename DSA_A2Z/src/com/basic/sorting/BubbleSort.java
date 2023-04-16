package com.basic.sorting;

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

		for (int i = 0; i < arr.length - 1; i++) {
			int didSwap = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					didSwap = 1;
				}
			}
			if (didSwap == 0) {
				break;
			}
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}
}
