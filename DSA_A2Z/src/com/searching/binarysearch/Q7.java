package com.searching.binarysearch;

/**
 * @author shubham.thakur Find the UpperBound in Binary Search I/p [2,4,6,7] x=5
 *         o/p :2 index Coding ninja
 *         https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries&leftPanelTab=0
 */
public class Q7 {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 7 };
		int target = 5;
		System.out.println(findUpperBound(arr, target));

	}

	public static int findUpperBound(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

}
