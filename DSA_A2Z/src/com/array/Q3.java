
package com.array;

import java.util.Arrays;

/*
 * DUTCh Flag Nation Algorithm
 * i/P  2, 1, 0, 1, 1, 0, 2, 1, 0, 1, 2
 * o/p  0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2
 */

public class Q3 {
	public static void main(String[] args) {
		int[] nums = { 2, 1, 0, 1, 1, 0, 2, 1, 0, 1, 2 };
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(DnfAlgorithm(nums)));

	}

	public static int[] DnfAlgorithm(int[] nums) {
		int start = 0;
		int mid = 0;
		int end = nums.length - 1;
		while (mid <= end) {
			if (nums[mid] == 0) {
				swap(mid, start, nums);
				start++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(mid, end, nums);
				end--;
			}
		}
		return nums;
	}

	public static void swap(int a, int b, int[] nums) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}