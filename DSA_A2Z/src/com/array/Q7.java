package com.array;

import java.util.Arrays;

/*
 * rotate the array 
 * int[] nums={1,2,3,4,5}; k=2;
 * o/p {4,5,1,2,3};
 */
public class Q7 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(nums));
		int k = 2;
//		System.out.println(Arrays.toString(rotation(nums, k)));
//		System.out.println(Arrays.toString(rotation1(nums, k)));
		rotate2(nums, k);
		System.out.println(Arrays.toString(nums));
	}

	// bruteforce approach O(n^2)
	public static int[] rotation(int[] nums, int k) {
		while (k > 0) {
			int temp = 0;
			int n = nums.length - 1;
			temp = nums[n];
			for (int i = n; i > 0; i--) {
				nums[i] = nums[i - 1];

			}
			nums[0] = temp;
			k--;
		}
		return nums;

	}

	// optimize approach O(N)
	public static int[] rotation1(int[] nums, int k) {

		int pos = k;
		for (int i = 0; i < nums.length; i++) {
			int newPos = (i + pos) % nums.length;
			swap(newPos, i, nums);
		}
		return nums;
	}

	public static void swap(int a, int b, int[] nums) {
		while (a < b) {
			int temp = nums[a];
			nums[a] = nums[b];
			nums[b] = temp;
			a++;
			b--;
		}
	}

	// best approach
	public static void rotate2(int[] arr, int k) {

		int n = arr.length;
		k = k % n;
		rotatePart(arr, 0, n - 1);
		rotatePart(arr, 0, k - 1);
		rotatePart(arr, k, n - 1);
	}

	public static void rotatePart(int[] arr, int s, int e) {
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
}
