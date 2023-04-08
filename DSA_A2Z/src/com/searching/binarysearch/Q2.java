package com.searching.binarysearch;

import java.util.Arrays;


/*Find First and Last Position of Element in Sorted Array(34 leet code)
 * https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
 * Input: nums = [5,7,7,8,8,10], target = 8
     Output: [3,4]
 * 
 */
public class Q2 {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int key = 8;
		System.out.println(Arrays.toString(occrance(arr, arr.length, key)));

		System.out.println("Binary search approach with TC O(logN)");

		System.out.println(Arrays.toString(firstLastOccrance(arr, arr.length, key)));

	}

	// Bruteforce approach o(n^2)
	public static int[] occrance(int[] arr, int n, int key) {
		int first = -1;
		int last = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				first = i;
				for (int j = i; j < n; j++) {
					if (arr[j] == key) {
						last = j;
					}
				}
				break;
			}

		}
		System.out.println("Bruteforce approach with TC O(N^2)");
		return new int[] { first, last };
	}

	public static int firstOccrance(int[] arr, int n, int key) {

		int start = 0;
		int end = n - 1;
		int ans = -1;
		int mid = start + (end - start) / 2;
		while (start <= end) {
			if (arr[mid] == key) {
				ans = mid;
				end = mid - 1;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return ans;
	}

	public static int lastOccrance(int[] arr, int n, int key) {

		int start = 0;
		int end = n - 1;
		int ans = -1;
		int mid = start + (end - start) / 2;
		while (start <= end) {
			if (arr[mid] == key) {
				ans = mid;
				start = mid + 1;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return ans;
	}

	public static int[] firstLastOccrance(int[] arr, int n, int key) {
		return new int[] { firstOccrance(arr, n, key), lastOccrance(arr, n, key) };
	}

}
