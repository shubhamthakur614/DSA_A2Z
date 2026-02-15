
package com.test;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
        int[] arr={3,2,7,4,6,1};
             System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void mergeSort(int[] arr){
        divide(arr,0,arr.length-1);
    }
    
    public static void divide(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
        
    }
    
    public static void merge(int[] arr,int low,int mid,int high){
        int idx1=low;
        int idx2=mid+1;
        
        int count=0;
        int [] merged=new int[high-low+1];
        
        while(idx1<=mid && idx2<=high){
            if(arr[idx1]<=arr[idx2]){
                merged[count++]=arr[idx1++];
            }
            else{
                merged[count++]=arr[idx2++];
            }
        }
        
        while(idx1<=mid){
             merged[count++]=arr[idx1++];
        }
        while(idx2<=high){
            merged[count++]=arr[idx2++];
        }
        
        for(int i=low;i<=high;i++){
            arr[i]=merged[i-low];
        }
    }
}
