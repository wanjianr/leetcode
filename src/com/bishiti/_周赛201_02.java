package com.bishiti;

public class _周赛201_02 {
    public char findKthBit(int n, int k) {
        StringBuilder stringBuilder = new StringBuilder("0");
        StringBuilder pre = new StringBuilder(stringBuilder.toString());
        for (int i = 1; i < n; i++) {
            stringBuilder.append("1");
            stringBuilder.append(reverse(invert(pre.toString())));
            pre = new StringBuilder(stringBuilder.toString());
        }
        String string = stringBuilder.toString();
        return string.charAt(k-1);
    }

    private String invert(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] == '0' ? '1' : '0';
        }
        return String.valueOf(chars);
    }

    private String reverse(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[len-1-i];
            chars[len-1-i] = temp;
        }
        return String.valueOf(chars);
    }
}
