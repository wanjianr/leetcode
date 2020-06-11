package com.douye.dynanicProgramming.easy;

public class _1025_除数博弈 {
    // 动态规划
    public boolean divisorGame(int N) {
        boolean[] d = new boolean[N+1];
        d[1] = false;
        d[2] = true;
        for (int i = 3; i <= N; i++) {
            d[i] = false;
            // 区间【1，i-1】寻找i的所有约数，同时满足d[i-j]=false
            for (int j = 1; j < i; j++) {
                if (i%j==0 && !d[i-j]) {
                    d[i] = true;
                    break;
                }
            }
        }
        return d[N];
    }

    // 归纳法
    public boolean divisorGame1(int N) {
        return N % 2 == 0;
    }
}
