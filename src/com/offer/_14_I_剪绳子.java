package com.offer;

public class _14_I_剪绳子 {

    /**
     数学推导 (n1+n2+n3)/3 >= 三次根号下(n1*n2*n3)
     当n1 = n2 = n3时三数的乘积最大
     */
    public int cuttingRope(int n) {
        if (n < 4) return n-1;
        int a = n/3, b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3,a);
        } else if (b == 1) {
            return (int) Math.pow(3,a-1) * 4;
        } else {
            return (int) Math.pow(3,a) * 2;
        }
    }

    // 动态规划
    public int cuttingRope3(int n) {
        if (n == 2) return 1;
        int[] dp = new int[n];
        dp[2] = 1;
        for (int i = 3; i < n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }

        }
        return dp[n-1];
    }

    // 记忆化递归
    public int cuttingRope2(int n) {
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
            dp[n] = res;
        }
        return res;
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
