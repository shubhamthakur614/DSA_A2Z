package com.searching.binarysearch;

public class Q6 {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(search(nums, target));

	}

	public static int search(int[] nums, int target) {
		int s = 0, e = nums.length-1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] >= nums[s]) {
                if (target < nums[s] || target > nums[mid]) {
                    s = mid+1;
                } else {
                    s = mid-1;
                }
            } else {
                if (target > nums[e] || target < nums[mid]) {
                    e = mid-1;
                } else {
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}
