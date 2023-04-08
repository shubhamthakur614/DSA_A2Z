package com.searching.binarysearch;

/*(33) https://leetcode.com/problems/search-in-rotated-sorted-array
 * 
 * There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], 
..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, 
[0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
    
 * 
 */
public class Q5 {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(rotetedSortedArray(nums, 0));
	}

	public static int rotetedSortedArray(int[] nums, int target) {
		int s = 0;
		int e = nums.length;
		int mid = s + (e - s) / 2;
		for (int i = 0; i < nums.length; i++) {

			if(nums[i]<nums[i+1])
			{
				s=mid+1;
			}
			else
			{
				e=mid;
				
			}
		}

		return s;
	}

}
