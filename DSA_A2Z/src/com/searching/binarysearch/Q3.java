package com.searching.binarysearch;

/*
 * 
 * 852. Peak Index in a Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * 
 */
public class Q3 {
	public static void main(String[] args) {
		int[] arr = { 0,2,1,0 };
		System.out.println(peakIndex(arr, arr.length));
	}

	public static int peakIndex(int[] arr, int n) {
		int start = 0;
		int end = n - 1;
		int mid = start + (end - start) / 2;
		while (start < end) {
			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else {
				end = mid;
			}
			 mid = start + (end - start) / 2;
		}
		return start;
	}
}
