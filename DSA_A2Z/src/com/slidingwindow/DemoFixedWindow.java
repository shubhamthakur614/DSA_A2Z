package com.slidingwindow;


//1. Build first window of size k
//2. Calculate its result
//3. Move right by 1
//        4. Remove left element
//5. Add new right element
//6. Update answer


public class DemoFixedWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumofConsecutiveWindow(arr,k));
    }

    public static int maxSumofConsecutiveWindow(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;

    }
}
