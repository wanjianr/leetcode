package com.offer;

public class _16_数值的整数次方 {
    public double myPow(double x, int n) {
        if (x == 1 || n == 0) return 1;
        long ns = n;
        double res = 1.0;
        if (ns < 0) {
            x = 1/x;
            ns = -ns;
        }

        while (ns != 0) {
            if ((ns & 1) != 0) res *= x;
            x *= x;
            ns = ns >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        _16_数值的整数次方 l = new _16_数值的整数次方();
        double v = l.myPow(4, -1);
        System.out.println(v);
    }
}
