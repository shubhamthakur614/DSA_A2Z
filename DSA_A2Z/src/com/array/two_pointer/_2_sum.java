package com.array.two_pointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2_sum {
    public static void main(String[] args) {
        // Test case: Unsorted array, return indices
        int[] arr = {2, 1, 1, 11, 7};
        int target = 9;

        System.out.println("=== APPROACH 1: HashMap (O(n) time, O(n) space) ===");
        System.out.println("Array: " + Arrays.toString(arr) + ", Target: " + target);
        System.out.println("Result with HashMap: " + Arrays.toString(twoSumHashMap(arr, target)));

        System.out.println("\n=== APPROACH 2: Brute Force (O(n²) time, O(1) space) ===");
        System.out.println("Result with Brute Force: " + Arrays.toString(twoSumBruteForce(arr, target)));

        System.out.println("\n=== APPROACH 3: Sort + Two Pointer (O(n log n) time, O(1) space) ===");
        System.out.println("Note: This changes index positions but maintains original values");
        System.out.println("Result with Sort + Two Pointer: " + Arrays.toString(twoSumSortedApproach(arr, target)));

        // Test case 2: Sorted array, return indices
        int[] sortedArr = {1, 2, 7, 11};
        int target2 = 9;
        System.out.println("\n=== TWO POINTER (for sorted array) ===");
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr) + ", Target: " + target2);
        System.out.println("Result with Two Pointer: " + Arrays.toString(twoPointer(sortedArr, target2)));
    }

    // APPROACH 1: HashMap - Best for unsorted arrays when you need original indices
    // Time: O(n), Space: O(n)
    public static int[] twoSumHashMap(int[] arr, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            }
            hm.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    // APPROACH 2: Brute Force - No extra space, but slower
    // Time: O(n²), Space: O(1)
    public static int[] twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // APPROACH 3: Sort + Two Pointer - No extra space, but indices change
    // Time: O(n log n), Space: O(1) (excluding sorting space)
    // NOTE: This returns pairs from sorted array, indices will be different!
    public static int[] twoSumSortedApproach(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[]{start, end}; // Returns indices in sorted array
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }

    // APPROACH 4: Two Pointer - For SORTED arrays
    // Time: O(n), Space: O(1)
    public static int[] twoPointer(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1}; // 1-indexed
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }
}
