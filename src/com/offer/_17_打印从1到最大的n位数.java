package com.offer;

public class _17_打印从1到最大的n位数 {
    public int[] printNumbers(int n) {
        int[] res = null;
        if (n < 10) {
            res = new int[9];
            for (int i = 0; i < res.length; i++) {
                res[i] = i+1;
            }
        }

        return res;
    }
}
