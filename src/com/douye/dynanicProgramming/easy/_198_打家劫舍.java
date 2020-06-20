package com.douye.dynanicProgramming.easy;

public class _198_打家劫舍 {
    public int rob(int[] nums) {
        if (nums.length < 1) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length+1];
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0],nums[1]);
        for (int i = 3; i <= nums.length; i++) {

            dp[i] = Math.max(nums[i-1] + dp[i-2],dp[i-1]);
        }
        return dp[nums.length];
    }
}
