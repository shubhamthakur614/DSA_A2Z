package com.array;

import java.util.Arrays;

//Maximum and minimum of an array using minimum number of comparisons
//Input: arr[] = {3, 5, 4, 1, 9}
//Output: Minimum element is: 1
//Maximum element is: 9

public class Q2 {

//	Bruteforce Approach t O(n) s (1)
	public static int[] getMinMax(int[] arr) {

		int min = arr[0];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];
			} else if (max < arr[i]) {
				max = arr[i];
			}
		}
		return new int[] { min, max };
	}

//	Class Pair is used to return two values from getMinMax()
	static class Pair {
		int min;
		int max;
	}

	// Complexity o(n) it reduce the comparison by 3(n-2)/2;
	public static Pair getMinMax1(int[] arr, int n) {
		Pair minMax = new Pair();
		int i;
		if (n == 1) {
			minMax.min = arr[0];
			minMax.max = arr[0];
		}

		// find if total element count is even or odd if even then initilize first and
		// sec to min max
		if (n % 2 == 0) {
			if (arr[0] > arr[1]) {
				minMax.max = arr[0];
				minMax.min = arr[1];
			} else {
				minMax.max = arr[1];
				minMax.min = arr[0];
			}
			i = 2;
//			set the i start from 2 in case of even
		}
		// if it is odd then assign first value to min and max
		else {
			minMax.max = arr[0];
			minMax.min = arr[0];
			i = 1;
		}
		// take two element from array and compare with the min max in pair
		while (i < n - 1) {
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > minMax.max) {
					minMax.max = arr[i];
				}
				if (arr[i + 1] < minMax.min) {
					minMax.min = arr[i + 1];
				}
			} else {
				if (arr[i + 1] > minMax.max) {
					minMax.max = arr[i + 1];
				}
				if (arr[i] < minMax.min) {
					minMax.min = arr[i];
				}
			}
			i += 2;
		}

		return minMax;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 4, 1, 9 };
		System.out.println(Arrays.toString(arr));
		int[] minMax = getMinMax(arr);
		System.out.println("Min: " + minMax[0] + " Max: " + minMax[1]);
		int[] arr1 = { 1, 6, 2, 4, 13, 4 };
		System.out.println(Arrays.toString(arr1));
		Pair minMaxPair = getMinMax1(arr1, arr1.length);
		System.out.println("Min: " + minMaxPair.min + " Max: " + minMaxPair.max);

	}

}