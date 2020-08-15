package com.douye;

public class _66_加一 {
    public int[] plusOne(int[] digits) {

        int len = digits.length;

        if (digits[len-1] > 9) {
            digits[len-1] = 0;
        } else {

        }
        for (int i = len - 1; i >= 0 ; i--) {
            digits[i] ++;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                break;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[len+1];
            res[0] = 1;
            return res;
        } else {
            return digits;
        }
    }
}
