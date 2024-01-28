package com.string;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
		System.err.println(sum);
		;

	}

	public static void merge(long arr1[], long arr2[], int n, int m) {
		// code here
		int i = arr1.length - 1;
		int j = 0;

		while (i >= 0 && j < arr2.length - 1) {

			if (arr1[i] > arr2[j]) {
				swap(arr1, arr2, i, j);
				i--;
			} else {
				j++;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

	public static void swap(long[] arr1, long[] arr2, int a, int b) {
		long temp = arr1[a];
		arr1[a] = arr2[b];
		arr2[b] = temp;
	}
}
