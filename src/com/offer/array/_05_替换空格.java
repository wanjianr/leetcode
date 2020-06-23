package com.offer.array;

public class _05_替换空格 {
    public String replaceSpace(String s) {
        if (s == null) return null;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==  ' ') stringBuilder.append("%20");
            else stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();

        // return s.replace(" ","%20");
    }
}
/**
 class Solution {
     public String replaceSpace(String s) {
         int length = s.length();
         char[] array = new char[length * 3];
         int size = 0;
         for (int i = 0; i < length; i++) {
             char c = s.charAt(i);
             if (c == ' ') {
                 array[size++] = '%';
                 array[size++] = '2';
                 array[size++] = '0';
             } else {
                array[size++] = c;
             }
         }
         String newStr = new String(array, 0, size);
         return newStr;
     }
 }

 */
