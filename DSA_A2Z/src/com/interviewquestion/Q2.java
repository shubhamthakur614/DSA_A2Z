package com.interviewquestion;

/*
 * Find the Maximum  and Minimum of an Array
 * 
 */
public class Q2 {
	public static void main(String[] args) {
		int[] arr = { 10, 12, 1, 57, 27, 18 };
		int[] maxMin = maxMin(arr);
		System.out.println("Min : " + maxMin[0] + "\t" + " Max: " + maxMin[1]);
	}

	public static int[] maxMin(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		return new int[] { min, max };
	}

}
