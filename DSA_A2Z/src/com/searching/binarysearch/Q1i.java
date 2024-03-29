package com.searching.binarysearch;

/*
 * 
 * Find the First occurrence in Binary Search 
 * i/p { 1, 2, 2, 2, 3, 4, 4, 4, 5 };target =4;
 * o/p 5 index
 */
public class Q1i {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 3, 4, 4, 4, 5 };
		int target = 4;
		System.out.println(findFirstOccuranceBS(arr, target));
	}

	public static int findFirstOccuranceBS(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// if find the element then find the left most element
			if (target == arr[mid]) {
				ans = mid;
				high = mid - 1;
				continue;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
