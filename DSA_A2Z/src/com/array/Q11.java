package com.array;

import java.util.Arrays;

//merge two sorted array without using the extra space 
/*
 * https://www.codingninjas.com/studio/problems/merge-two-sorted-arrays-without-extra-space_6898839?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
   
   When ‘N’ = 4, ‘A’ = {1, 4, 5, 7} and ‘M’ = 3, ‘B’ = {2, 3, 6}. 
   We can merge these two arrays into {1, 2, 3, 4, 5, 6, 7} (The elements of ‘A’ are {1, 2, 3, 4} ).
   Hence, the answer is {1, 2, 3, 4, 5, 6, 7}.
 */
public class Q11 {
	public static void main(String[] args) {
		long[] a = { 1, 4, 5, 7 };
		long[] b = { 2, 3, 6 };
		int n = a.length;
		int m = b.length;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
//		bruteforceApproach(a, b, n, m);
		System.out.println("Bruteforce approach approach with extra space and T- o(m+n) & S- o(n)");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Optimal Approach 1 with rearrange and then sort");
//		mergeTwoSortedArraysWithoutExtraSpace(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		merge(a, b, n, m);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

	public static void bruteforceApproach(long[] a, long[] b, int n, int m) {

		// time complexity O(m+n)
		// space Complexity o(n) as i am using extra space to create an array

		int i = 0;
		int j = 0;
		long[] arr3 = new long[m + n];
		int count = 0;
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				arr3[count++] = a[i++];
			} else {
				arr3[count++] = b[j++];
			}
		}
		while (i < a.length) {
			arr3[count++] = a[i++];
		}
		while (j < b.length) {
			arr3[count++] = b[j++];
		}

		// then put the value based on required but while putting into sec array given i
		// - first length

		for (int x = 0; x < m + n; x++) {
			if (x < n) {
				a[x] = arr3[x];
			} else {
				b[x - n] = arr3[x];
			}
		}

	}

	public static void merge(long arr1[], long arr2[], int n, int m) {

		// code here
		int len = n + m;
		int gap = (len / 2) + (len % 2);
		while (gap > 0) {
			int left = 0;
			int right = left + gap;
			while (right < len) {
				// arr1 and arr2
				if (left < n && right >= n) {
					checkIfGreater(arr1, arr2, left, right - n);
				} 
				//arr2 arr2
				else if (left >= n) {
					checkIfGreater(arr2, arr2, left - n, right - n);
				}
				//arr1 arr1
				else {
					checkIfGreater(arr1, arr1, left, right);
				}
				left++;
				right++;
			}
			if (gap == 1) {
				break;
			}
			gap = (gap / 2) + (gap % 2);

		}
	}

	public static void checkIfGreater(long[] arr1, long[] arr2, int x, int y) {
		if (arr1[x] > arr2[y]) {
			swap(arr1, arr2, x, y);
		}
	}

	public static void swap(long[] arr1, long[] arr2, int x, int y) {
		long temp = arr1[x];
		arr1[x] = arr2[y];
		arr2[y] = temp;
	}
}
