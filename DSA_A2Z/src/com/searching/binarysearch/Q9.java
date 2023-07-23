package com.searching.binarysearch;

/*
 * Frequency of Count using BS
 * i/p {1,1,1,2,2,3,3}
 * x=3
 * o/p 2 times
 */
public class Q9 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3, 3 };
		int x = 3;
		int n = arr.length;
		int count = frequencyCount(arr, n, x);
		System.out.println(count);
	}

	public static int frequencyCount(int[] arr, int n, int x) {
		int[] position = firstAndLastPosition(arr, n, x);
		if (position[0] == -1)
			return 0;
		return (position[1] - position[0] + 1);
	}

	public static int[] firstAndLastPosition(int[] arr, int n, int x) {
		int first = firstOccurance(arr, n, x);
		if (first == -1)
			return new int[] { -1, -1 };
		int last = lastOccurance(arr, n, x);
		return new int[] { first, last };
	}

	public static int firstOccurance(int[] arr, int n, int x) {
		int low = 0;
		int high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				ans = mid;
				high = mid - 1;
				continue;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static int lastOccurance(int[] arr, int n, int x) {
		int low = 0;
		int high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				ans = mid;
				low = mid + 1;
				continue;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}
}
