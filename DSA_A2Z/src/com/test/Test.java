package com.test;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 7, 7, 10 };// 3-5=2+1=3
		int target = 7;
		// frequency of target using ub and lb
		int frequency = frequency(arr,target);
		System.out.println(frequency);

	}
	public static int frequency(int[] arr,int target)
	{
		int lb = lb(arr, target);
		int ub = ub(arr, target);
		if(arr[lb]!=target)
			return -1;
		else {
			return ub-lb;
		}
	}

	public static int lb(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= target) {
				ans = mid;
				high = mid - 1;
				continue;
			}
			if (target > +arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}
	
	public static int ub(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= target) {
				ans = mid;
				low = mid + 1;
				continue;
			}
			if (target > +arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
