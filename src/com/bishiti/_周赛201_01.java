package com.bishiti;

public class _周赛201_01 {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        boolean flag = true;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i-1]-'a' == chars[i]-'A' || chars[i-1]-'A' == chars[i]-'a') {
                chars[i-1] = ' ';
                chars[i] = ' ';
                flag = false;
            }
        }
        String replace = String.valueOf(chars).replace(" ", "");
        if (flag) return replace;
        return makeGood(replace);
    }
}
