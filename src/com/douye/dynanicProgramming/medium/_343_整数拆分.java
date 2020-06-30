package com.douye.dynanicProgramming.medium;

public class _343_整数拆分 {

    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i-1],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }

    // 记忆化搜索
    int[] memony;
    public int integerBreak2(int n) {
        memony = new int[n+1];
        memony[2] = 1;
        sulotion(n);
        return memony[n];
    }

    public int sulotion(int n) {
        if (memony[n] != 0) return memony[n];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            max = Math.max(max,Math.max(i*(n-i),i*sulotion(n-i)));
        }
        memony[n] = max;
        return max;
    }

    // 暴力递归 到31会超时
    public int integerBreak1(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            max = Math.max(max,Math.max(i*(n-i),i*integerBreak1(n-i)));
        }
        return max;
    }

    public static void main(String[] args) {
        _343_整数拆分 t = new _343_整数拆分();
        System.out.println(t.integerBreak(10));
    }
}
