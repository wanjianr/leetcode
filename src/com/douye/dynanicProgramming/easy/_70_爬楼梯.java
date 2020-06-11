package com.douye.dynanicProgramming.easy;

public class _70_爬楼梯 {
    public int climbStairs(int n) {
        if (n < 2) return 1;
        if (n == 2) return 2;
        int dp1 = 1;
        int dp2 = 2;
        int dp = 0;
        for (int i = 3; i <= n; i++) {
            dp = dp1 + dp2;
            dp1 = dp2;
            dp2 = dp;
        }
        return dp;
    }

    public int climbStairs1(int n) {
        if(n < 2) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
