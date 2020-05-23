package com.douye.sort;

import java.util.Arrays;

public class _1370_上升下降字符串 {
    public static void main(String[] args) {

        _1370_上升下降字符串 s = new  _1370_上升下降字符串();
        String result = s.sortString("aaaabbbbcccc");
        System.out.println(result);
    }

    public String sortString(String s) {
        String result = new String();
        boolean complete;
        int[] countArry = new int[26]; // 对s中出现的字母进行计数
        for (int i = 0; i < s.length(); i++) {
            countArry[s.charAt(i) - 'a'] ++;
        }
        do {
            complete = false;
            for (int i = 0; i < 26; i++) {
                if (countArry[i] > 0 ) {
                    result += (char)(i+'a');
                    countArry[i]--;
                    complete = true;
                }
            }
            for (int i = 25; i >= 0 ; i--) {
                if (countArry[i] > 0) {
                    result += (char)(i+'a');
                    countArry[i]--;
                    complete = true;
                }
            }
        } while (complete);

        return result;
    }
}
