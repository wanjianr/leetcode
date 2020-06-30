package com.offer;

public class _14_I_剪绳子 {

    // 记忆化递归
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        int[] dp = new int[n+1];
        return getSolution(dp, n);
    }

    public int getSolution(int[] dp, int n) {
        if (n == 2) return 1;
        if (dp[n] != 0) return dp[n];
        int res = -1;
        for (int i = 1; i < n; i++) {
            res = Math.max(res,Math.max(i*(n-i),i*getSolution(dp,n-i)));
            dp[i] = res;
        }
        return dp[n];
    }


    // 超时
    public int cuttingRope1(int n) {
        if (n == 2) return 1;
        int res = -1;
        for (int i = 1; i < n; i++) {
            res = Math.max(res,Math.max(i*(n-i),i*cuttingRope1(n-i)));
        }
        return res;
    }
}
