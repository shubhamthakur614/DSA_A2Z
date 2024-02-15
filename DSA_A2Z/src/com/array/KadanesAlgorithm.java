  package com.array;
//it is also called as maxsubarray from given array

import java.util.Arrays;

//make sure never carry negative value and if previous sum is negative start with new by 
//making curr as new or 0

public class KadanesAlgorithm {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = maxSubArraySum(arr);
		System.out.println(maxSum);
		int[] maxSumIndex = maxSubArrayWithIndex(arr);
		System.out.println(Arrays.toString(maxSumIndex));

	}

	public static int maxSubArraySum(int[] arr) {

		int max = 0;
		int curr = 0;
		for (int i = 0; i < arr.length; i++) {
			curr = curr + arr[i];
			// if curr is greater than max or not if yes then make max as curr
			if (curr > max) {
				max = curr;
			}
			// if not then check if curr is negative or not if negative make it 0
			if (curr < 0) {
				curr = 0;
			}

		}
		return max;

	}

	public static int[] maxSubArrayWithIndex(int[] arr) {

		int max = 0;
		int curr = 0;
		int start = 0;
		int end = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			curr = curr + arr[i];
			// if curr is greater than max or not if yes then make max as curr
			if (curr > max) {
				max = curr;
				// when max is initialize with curr then start updating your start and end
				// pointer
				start = temp;
				end = i;
			}
			// if not then check if curr is negative or not if negative make it 0
			if (curr < 0) {
				curr = 0;
				// if curr is negative make end or start as curr +1;
				temp = i + 1;
			}

		}
		return new int[] { max, start, end };
	}

}
