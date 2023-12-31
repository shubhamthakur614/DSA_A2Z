package com.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 7, 4, 6, 1 };
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				swap(arr, j - 1, j);
				j--;
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
