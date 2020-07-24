package com.offer;

public class _17_打印从1到最大的n位数 {
    public int[] printNumbers(int n) {
        int[] res = null;
        int end = 0;
        for(int i=0; i<n; i++) {
            end = end*10 + 9;
        }
        res = new int[end];
        for (int i = 0; i < res.length; i++) {
            res[i] = i+1;
        }
        return res;
    }
}
