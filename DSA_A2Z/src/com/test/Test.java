package com.test;

import java.util.Arrays;

public class Test 
{
	public static void main(String[] args) {
		
		int [] arr=new int[] {13,46,24,52,20,9};
//		selectionSort(arr);
		bubbleSort(arr);
		
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min =i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
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

	public static void bubbleSort(int[] arr)
	{
		int didSwap=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					didSwap=1;
				}
			}
			if(didSwap==0)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
