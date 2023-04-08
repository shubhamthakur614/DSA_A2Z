package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*two sum 
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
		System.out.println(Arrays.toString(twoSum(nums, target)));

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