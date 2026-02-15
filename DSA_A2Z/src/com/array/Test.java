package com.array;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		int k = 2;

		System.out.println("ArrayList Before  rotation: " + arrayList);
		rotate(arrayList, k);

		System.out.println("ArrayList after rotation: " + arrayList);
	}

	public static void rotate(List<Integer> nums, int k) {
		int n = nums.size();
		k = k % n;
		reversePart(nums, 0, n - 1);
		reversePart(nums, 0, k - 1);
		reversePart(nums, k, n - 1);
	}

	public static void reversePart(List<Integer> arr, int s, int e) {
		while (s < e) {
			// Swap elements at indices s and e
			int temp = arr.get(s);
			arr.set(s, arr.get(e));
			arr.set(e, temp);
			s++;
			e--;
		}
	}
}
