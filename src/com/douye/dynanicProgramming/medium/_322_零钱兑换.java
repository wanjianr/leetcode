package com.douye.dynanicProgramming.medium;

import java.util.Arrays;

public class _322_零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        if (coins.length < 1 || coins == null) return -1;
        int[] dp = new int[amount+1];
        // Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                    min = Math.min(min,dp[i-coins[j]]);
            }
            dp[i] = min == Integer.MAX_VALUE ? -1 : min+1;
        }
        return dp[amount];
    }
}
