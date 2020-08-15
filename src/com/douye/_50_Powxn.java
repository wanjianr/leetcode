package com.douye;

public class _50_Powxn {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1/x;
        }
        double  res = 1;
        while (n > 0) {
            if ((n&1) == 1) res *= x;
            x *= x;
            n = n >> 1;
        }
        return res;
    }
}
