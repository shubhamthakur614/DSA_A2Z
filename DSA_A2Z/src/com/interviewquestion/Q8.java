package com.interviewquestion;

import java.util.Arrays;

/*
 * 
 * Move all even at left side and all odd at right side 
 */
public class Q8 {
	public static void main(String[] args) {
		int[] arr = { 12, 13, 42, 1, 2, 34, 2, 7, 8, 9 };
		even_left_Shifting(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr1 = { 2, 1, 0, 1, 1, 2, 0, 1, 2, 2, 0 };
		dutchFlag(arr1);
		System.out.println(Arrays.toString(arr1));

	}

	public static void even_left_Shifting(int[] arr) {

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] % 2 != 0) {
				if (arr[j] % 2 == 0) {
					swap(arr, i, j);
				} else {
					j--;
				}
			} else {
				i++;
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void dutchFlag(int[] arr) {

		int s = 0;
		int m = 0;
		int e = arr.length - 1;
		while (m <= e) {
			if (arr[m] == 0) {
				swap(arr, m, s);
				s++;
				m++;
			} else if (arr[m] == 1) {
				m++;
			} else {
				swap(arr, m, e);
				e--;
			}
		}
	}

}
