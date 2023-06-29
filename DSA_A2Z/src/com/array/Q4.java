package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Two sum 
 * 1)Bruteforce Approach
 * One brute force approach is to consider every pair of elements and check if their sum equals the target. 
 * This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, 
 * and the inner loop iterates from the next element to the last element. 
 *However, this approach has a time complexity of O(n^2).
 * 
 * https://leetcode.com/problems/two-sum/
 * 
 * Input: nums = [2,7,11,15], target = 9
   Output: [0,1]
   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

public class Q4 {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum1(nums, target)));
		System.out.println(Arrays.toString(twoSum(nums, target)));
		
	}

	public static int[] twoSum1(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> m = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (m.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = m.get(target - nums[i]);
			}
			m.put(nums[i], i);
		}
		return result;
	}

}