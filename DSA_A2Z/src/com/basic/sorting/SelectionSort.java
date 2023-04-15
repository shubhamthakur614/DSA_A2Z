package com.basic.sorting;

import java.util.Arrays;
/*
 * Selection sort
 * 1) take first element as min ans find the min element in the array 
 * 2) once min element find replace with first element 
 * 3) next time replace with sec element this way it goes
 * 
 */

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr=new int[] {13,46,24,52,20,9};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min =arr[i];
			for(int j=i;j<arr.length;j++)
			{
				if(min>arr[j])
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
