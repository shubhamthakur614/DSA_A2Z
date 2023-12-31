package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 7, 4, 6, 1 };
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean swaped = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					swaped = true;
				}
			}
			if (!swaped) {
				break;
			}
		}

	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
