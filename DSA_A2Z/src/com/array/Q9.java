package com.array;

//leetcode remove duplicate from sorted array and return the length of array
/*Q1
 * EG:{1,1,,2,4,4,5}
 * o/p {1,2,4,5} 4 return 
 * 
 */

/*Q2.80. Remove Duplicates from Sorted Array II
 * Remove duplicate but two are allowed from array
 * 
 * EG{1,1,2,2,2,2,4,4,5,5,5,6}
 * {1,1,2,2,4,4,5,5,6} 9
 * 
 */
public class Q9 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 4, 4, 5 };
		System.out.println(removeDuplicate1(arr));
		int[] arr1 = { 1, 1, 2, 2, 2, 2, 4, 4, 5, 5, 5, 6 };
		System.out.println(removeDuplicate2(arr1));

	}

	public static int removeDuplicate1(int[] arr) {

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		return i + 1;
	}

	public static int removeDuplicate2(int[] arr) {

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (j == 0 || j == 1 || arr[i - 2] != arr[j]) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}

}
