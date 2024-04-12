package com.array;

/*
 * Rain water tapping problem leetcode
 */
public class Q12 {
	public static void main(String[] args) {
		int[] arr = { 3, 0, 0, 2, 0, 4 };
		System.out.println(rainWaterTapping(arr));

	}

//Time complexity O(n) space complexity O(n)
	public static int rainWaterTapping(int[] arr) {

		int n = arr.length;
		int sum = 0;
		if (n == 0 || n == 1) {
			return 0;
		}
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];

		leftMax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
		}
		rightMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(arr[i], rightMax[i + 1]);

		}
		for (int i = 0; i < n; i++) {
			sum += Math.min(leftMax[i], rightMax[i]) - arr[i];
		}
		return sum;

	}

}
