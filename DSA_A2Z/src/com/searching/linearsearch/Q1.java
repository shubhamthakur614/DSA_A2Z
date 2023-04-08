package com.searching.linearsearch;

public class Q1 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 6, 2, 7, 5 };
		int n = arr.length;
		int key = 2;
		System.out.println("Element present in index: "+linearSearch(arr, n, key));

	}

	public static int linearSearch(int[] arr, int n, int key) {

		int ans = -1;
		if (n < 1) {
			return -1;
		} else {
			for (int i = 0; i < n; i++) {
				if (arr[i] == key) 
				{
				 ans=i;
				}
			}
			return ans;
		}
	}

}
