package com.test;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2,3,3,5,5 };// 3-5=2+1=3
		int target = 3;
		// frequency of target using ub and lb
		int frequencyCount = frequencyCount(arr, target);
		System.out.println(frequencyCount);

	}

	public static int frequencyCount(int[] arr, int x) {
		int[] firstAndLastOcceranceFreq = firstAndLastOccerance(arr,x);
		if(firstAndLastOcceranceFreq[0]==-1)return 0;
		return (firstAndLastOcceranceFreq[1]-firstAndLastOcceranceFreq[0]+1);

	}

	public static int[] firstAndLastOccerance(int[] arr, int x) {
		int firstOccerance = firstOccerance(arr, x);
		if (firstOccerance == -1)
			return new int[] { -1, -1 };

		int lastOccerance = lastOccerance(arr, x);
		return new int[] { firstOccerance, lastOccerance };
	}

	public static int firstOccerance(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				ans = mid;
				high = mid - 1;
				continue;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;

	}

	public static int lastOccerance(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				ans = mid;
				low = mid + 1;
				continue;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
