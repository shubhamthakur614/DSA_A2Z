package com.array.two_pointer;

import java.util.Arrays;

public class duplicate_element {
    public static void main(String[] args) {
        int[] nums={1,1,3,2,1,4};

//        int[] sorted_nums={1,1,2,2,3,4};
        int[] original=new int[nums.length];
        int k=0;

        for(int i=0;i<nums.length;i++){
            boolean isDuplicate=false;
            // Check if current element already exists in result array
            for(int j=0;j<k;j++){
                if(nums[i]==original[j]){
                    isDuplicate=true;
                    break;
                }
            }
            // Add element if it's not a duplicate
            if(!isDuplicate){
                original[k++]=nums[i];
            }
        }

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Array without duplicates (length " + k + "): " + Arrays.toString(Arrays.copyOf(original, k)));

        //using two pointer approach return original number counts
        System.out.println(duplicate(nums));
    }

    public static int duplicate(int[] arr){
        Arrays.sort(arr);
        int start = 0;  // Position to place unique element

        // Iterate through array starting from index 1
        for(int end = 1; end < arr.length; end++){
            // If current element is different from previous
            if(arr[start] != arr[end]){
                start++;  // Move start pointer to next position
                arr[start] = arr[end];  // Place unique element
            }
            // If duplicate, just move end forward (skip it)
        }
        return start + 1;  // Return count of unique elements
    }
}

