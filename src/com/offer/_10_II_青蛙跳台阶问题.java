package com.offer;

public class _10_II_青蛙跳台阶问题 {
    public int numWays(int n) {
        if (n == 0) return 1;
        if (n<3) return n;
        int fir = 1;
        int sec = 2;
        int dp = 0;
        for (int i = 3; i <= n; i++) {
            dp = (fir + sec) % 1000000007;
            fir = sec;
            sec = dp;
        }
        return dp;
    }
}
