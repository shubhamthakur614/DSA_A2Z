package com.searching.binarysearch;

/*
 * https://leetcode.com/problems/find-pivot-index/description/
 * Given an array of integers nums, calculate the pivot index of this array.

	The pivot index is the index where the sum of all the numbers strictly 
	to the left of the index is equal to the sum of all the numbers strictly
	 to the index's right.
 
	 Input: nums = [1,7,3,6,5,6]
	Output: 3
	Explanation:
	The pivot index is 3.
	Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
	Right sum = nums[4] + nums[5] = 5 + 6 = 11
 * 
 */
public class Q4 {
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		System.out.println(findPivot(nums));

	}

	public static int findPivot(int[] nums) {
		int n = nums.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
		}
		int leftsum = 0;
		for (int i = 0; i < n; i++) {
			if (leftsum == sum - leftsum - nums[i]) {
				return i;
			}
			leftsum += nums[i];
		}
		return -1;
	}

}
