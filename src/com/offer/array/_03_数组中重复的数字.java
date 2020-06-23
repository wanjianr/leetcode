package com.offer.array;

import java.util.HashSet;
import java.util.Set;

public class _03_数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
//        int[] dp = new int[nums.length];
//        for (int i = 0; i <nums.length; i++) {
//            dp[nums[i]] ++;
//            if (dp[nums[i]] > 1){
//                return nums[i];
//            }
//        }
//        return -1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}
