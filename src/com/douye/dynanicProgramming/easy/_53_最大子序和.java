package com.douye.dynanicProgramming.easy;

public class _53_最大子序和 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        int maxSum = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (dp[i-1] < 0) {
                dp[i] = nums[i-1];
            } else {
                dp[i] = dp[i-1] + nums[i-1];
            }
            maxSum = Math.max(maxSum,dp[i]);
        }
        return maxSum;
    }
}
