package com.offer;

public class _10_I_斐波那契数列 {
    // 记忆化递归
    public int fib(int n) {
        if (n < 2) return n;
        int[] dp = new int[n+1];
        return helper(dp,n);
    }
    public int helper(int[] dp, int n) {
        if (n==1 || n==2) return 1;
        if (dp[n] == 0) {
            dp[n] = helper(dp,n-1) + helper(dp,n-2);
        }
        return dp[n];
    }

    // 动态规划
    public int fib1(int n) {
        if (n < 2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }

    // 动态规划优化
    public int fib2(int n) {
        if (n < 2) return n;
        int preF = 1,preS = 0, dp = 0;
        for (int i = 2; i <= n; i++) {
            dp = (preF + preS) % 1000000007;
            preS = preF;
            preF = dp;
        }
        return dp;
    }
}
