package com.array;

/*
 * Find the K largest element from the array(Microsoft)
 * i/p {1,5,4,3,6,7} k=2;
 * o/p 6
 */
public class Q10 {
	public static void main(String[] args) {
		int[] nums = { 1, 5, 4, 3, 6, 7 };
		int k = 2;
		int k_largest = k_Largest(nums, k);
		System.out.println(k_largest);

	}

	public static int k_Largest(int[] nums, int k) {

		int n = nums.length;
		int l = 0;
		int r = n - 1;
		int pivot_idx = 0;
		while (true) {
			pivot_idx = pivot(nums, l, r);
			if (pivot_idx == k - 1) {
				break;
			} else if (pivot_idx > k - 1) {
				r = pivot_idx - 1;
			} else {
				l = pivot_idx + 1;
			}
		}
		return nums[pivot_idx];
	}

	public static int pivot(int[] nums, int l, int r) {

		int pivot = nums[l];
		int i = l + 1;
		int j = r;
		while (i <= j) {
			if (nums[i] < pivot && nums[j] > pivot) {
				swap(nums, i, j);
				i++;
				j--;
			}
			if (nums[i] >= pivot) {
				i++;
			}
			if (nums[j] <= pivot) {
				j--;
			}
		}
		swap(nums, l, j);
		return j;
	}

	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
