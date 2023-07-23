package com.searching.binarysearch;

/*
 * Find the floor and sail value of X
 * int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        he floor and ceil are: 4 7
 */
public class Q8 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 4, 7, 8, 10 };
		int target = 5;
		int[] findFloorAndCeilValue = findFloorAndCeilValue(arr, target);
		System.out.println("Floor value of X is: " + findFloorAndCeilValue[0] + "\n Ceil value of X is: "
				+ findFloorAndCeilValue[1]);

	}

	public static int[] findFloorAndCeilValue(int[] arr, int target) {
		int findFloor = findFloor(arr, target);
		int findCeil = findCeil(arr, target);
		return new int[] { findFloor, findCeil };

	}

	public static int findFloor(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// here we are implementing logic for floor by updating the BS
			if (arr[mid] <= target) {
				ans = arr[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static int findCeil(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// using lowerBound(either equal or greater)
			if (arr[mid] >= target) {
				ans = arr[mid];
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

}
