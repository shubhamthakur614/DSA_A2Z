package com.array;

/*
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/ 
 * problem no 4 leetcode
 * 4. Median of Two Sorted Arrays
    
    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

	The overall run time complexity should be O(log (m+n)).
	
	 
	
	Example 1:
	
	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
	Example 2:
	
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 */
public class Q6 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2, 4 };
		System.out.println(medianOfTwoSortedArrays(nums1, nums2));

	}

	public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2) {
		return 1.0;

	}

}
