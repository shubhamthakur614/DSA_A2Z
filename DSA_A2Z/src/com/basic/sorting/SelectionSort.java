package com.basic.sorting;

import java.util.Arrays;
/*
 * Selection sort
 * 1) take first element as min and find the min element in the array 
 * 2) once min element find replace with first element 
 * 3) next time replace with sec element this way it goes
 * 4)selection sort take the minimum element at start
 * 
 */

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr=new int[] {13,46,24,52,20,9};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min =i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
