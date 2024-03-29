package com.searching.binarysearch;

/*
 * Find the lower bound using Binary Search
 * coding ninja
 * https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries
 * 
 * i/p [1,2,2,3], target =0;
 * o/p 0
 */
public class Q6 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3 };
		int target = 0;
		System.out.println(findLowerBoundinBS(arr, target));
	}

	public static int findLowerBoundinBS(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// here we are having only two condition either value is either
//			present or not present
			if (arr[mid] >= target) {
				ans = mid;
				high = mid - 1;
			} else {
				low = high + 1;
			}
		}
		return ans;
	}

}
