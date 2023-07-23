package com.searching.binarysearch;

/*
 * Find the last occurrence in Binary Search
 */
public class Q1ii {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 3, 4, 4, 4, 5 };
		int target = 4;
		System.out.println(findlastOccuranceBS(arr, target));
	}

	public static int findlastOccuranceBS(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target == arr[mid]) {
				ans = mid;
				high = mid - 1;
				continue;
			}
			if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}
}
