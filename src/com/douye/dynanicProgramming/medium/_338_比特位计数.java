package com.douye.dynanicProgramming.medium;

public class _338_比特位计数 {
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        if (num == 0) return dp;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = dp[i>>1];
            }
        }
        return dp;
    }

    public int[] countBits1(int num) {
        int[] dp = new int[num+1];
        if (num == 0) return dp;
        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i&(i-1)] + 1;
        }
        return dp;
    }

}
