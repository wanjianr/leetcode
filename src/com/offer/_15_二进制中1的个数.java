package com.offer;

public class _15_二进制中1的个数 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n = n&(n-1);
        }
        return res;
//        if (n <= 1) return n;
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i&(i-1)] + 1;
//        }
//        return dp[n];
    }
}
