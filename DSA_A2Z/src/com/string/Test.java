package com.string;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 7, 4, 6, 1 };
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void mergeSort(int [] arr,int n) {
		divide(arr,0,n-1);
	}
	
	public static void divide(int[] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		
		int mid=low+(high-low)/2;
		
		divide(arr,low,mid);
		divide(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	public static void merge(int[] arr,int low,int mid,int high) {
		int left=low;
		int right=mid+1;
		int count=0;
		
		int[] merge=new int[high-low+1];
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				merge[count++]=arr[left++];
			}
			else {
				merge[count++]=arr[right++];
			}
		}
		
		while(left<=mid) {
			merge[count++]=arr[left++];
		}
		
		while(right<=high) {
			merge[count++]=arr[right++];
		}
		
		for(int i=low;i<=high;i++) {
			arr[i]=merge[i-low];
		}
	}

	
}
