package com.douye;

public class _69_x的平方根 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            int temp = x/mid;
            if (temp < mid) {  // mid * mid > x
                right = mid;
            } else if (temp > mid){
                left = mid;
            } else {
                return mid;
            }
        }
        return left;
    }
}
