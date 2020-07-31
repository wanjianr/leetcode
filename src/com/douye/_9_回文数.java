package com.douye;

public class _9_回文数 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;
        while (x != 0) {
            int l = x / div;
            int r = x % 10;
            if (l != r) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) return false;
        String string = Integer.toString(x);
        int l = 0, r = 0, len = string.length();
        if (len == 1) return true;
        if (len % 2 == 0) {
            l = len / 2;
            r = l;
        } else {
            r = len / 2;
            l = r - 1;
        }
        return valid(string,l,r);
    }

    private boolean valid(String s, int l, int r) {
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            } else {
                break;
            }
        }

        if (l==-1 && r==s.length()) {
            return true;
        } else {
            return false;
        }
    }
}
