package com.douye;

public class _7_整数反转 {
    public int reverse(int x) {
        int ans = 0, pop = 0;
        while (x != 0) {
            pop = x % 10;
            if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE && pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE && pop < -8)) {
                return 0;
            }
            ans = ans*10 + pop;
            x /= 10;
        }
        return ans;
    }
}
