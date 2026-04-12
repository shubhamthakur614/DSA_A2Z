package com.array.two_pointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//leetcode 2984

public class Count_pair_less_than_target {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(-1, 1, 2, 3, 1));
        int target = 2;
        System.out.println(countPairs(nums,target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int start = 0;
        int end = nums.size() - 1;
        int countPair = 0;

        while (start < end) {
            if (nums.get(start) + nums.get(end) < target) {
                countPair += (end - start);
                start++;
            } else {
                end--;
            }
        }
        return countPair;
    }
}
