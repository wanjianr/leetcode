package com.offer;

public class _14_II_剪绳子 {
    public int cuttingRope(int n) {
        if (n < 4) return n-1;
        long a = n/3, b = n % 3;
        if (b == 0) {
            return (int) ((long) Math.pow(3,a) % 1000000007);
        } else if (b == 1) {
            return (int) (((long) Math.pow(3,a-1) * 4) % 1000000007);
        } else {
            return (int) (((long) Math.pow(3,a) * 2) % 1000000007);
        }
    }
}
