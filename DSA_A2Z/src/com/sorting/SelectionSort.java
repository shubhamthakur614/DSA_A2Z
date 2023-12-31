package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 7, 4, 6, 1 };
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
