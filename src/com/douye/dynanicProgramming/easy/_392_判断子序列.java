package com.douye.dynanicProgramming.easy;

public class _392_判断子序列 {
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        int index = -1;
        for (char aChar : chars) {
            // index = t.indexOf(aChar,index+1);
            index = getIndex(aChar,index+1,t.toCharArray());
            if (index == -1) return false;
        }
        return true;
    }

    public int getIndex(char c, int fromUndex, char[] chars) {
        if (fromUndex > chars.length) return -1;
        for (int i = fromUndex; i < chars.length; i++) {
            if (c == chars[i]) {
                return i;
            }
        }
        return -1;
    }
}
