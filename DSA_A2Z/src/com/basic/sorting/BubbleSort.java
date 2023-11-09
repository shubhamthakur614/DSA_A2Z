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
//		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		bubbleSort(arr);
	}

	public static void bubbleSort(int[] arr) {
		int size = arr.length;

		System.out.println("Before sorting: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}

		for (int i = 0; i < size; i++) {
			boolean swapped = false;

			// every iteration we have highest element at last so we don't need to compare

			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1, arr);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

		System.out.println("\n After sorting: ");

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	public static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}
}
