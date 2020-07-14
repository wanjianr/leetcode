package com.douye.hot100.easy;

public class _5_最长回文子串 {


    // 动态规划-dp[]
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverse = stringBuilder.reverse().toString();
        int len = s.length(),maxLen=0,maxEnd=0;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = len-1; j >= 0; j--) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i==0 || j==0) {
                        dp[j] = 1;
                    } else {
                        dp[j] = dp[j-1] + 1;
                    }
                } else {
                    dp[j] = 0;
                }

                if (dp[j] > maxLen) {
                    int beforeIndex = len-1-j;
                    if (beforeIndex + dp[j]-1 == i) {
                        maxLen = dp[j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd-maxLen+1,maxEnd+1);
    }

    // 动态规划-dp[][]
    public String longestPalindrome3(String s) {
        if (s.length() < 2) return s;
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverse = stringBuilder.reverse().toString();
        int len = s.length(),maxLen=0,maxEnd=0;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i==0 || j==0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }
                }

                if (dp[i][j] > maxLen) {
                    int beforeIndex = len-1-j;
                    if (beforeIndex+dp[i][j]-1 == i) {
                        maxLen = dp[i][j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd-maxLen+1,maxEnd+1);
    }


    public String longestPalindrome2(String s) {
        if (s.length() < 2) return s;
        String res = s.charAt(0) + "";
        int len = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String str = s.substring(i,j+1);
                int subLen = str.length()-1;
                if (isPalindrome(str) && len < subLen) {
                    len = subLen;
                    res = str;
                    if (len == s.length()-1) break;
                }
            }
        }
        return res;
    }

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length();
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome1(String s) {
        if (s.length() < 2) return s;
        String res = s.charAt(0) + "";
        int len = 1;
        for (int start = 0,end = 1; end < s.length(); end++) {
            if (s.charAt(start) == s.charAt(end)) {
                int l = start, r = end;
                while (l < r) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l++;
                        r--;
                    } else {
                        break;
                    }
                }
                if (l >= r) {
                    int subLen = end-start+1;
                    if (len < subLen) {
                        res = s.substring(start,end+1);
                        len = subLen;
                        if(len == s.length()) break;
                    }

                }
            }
            if (start < s.length() && end == s.length()-1) {
                start++;
                end = start;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _5_最长回文子串 l = new _5_最长回文子串();
        String s = l.longestPalindrome("aaa");
        System.out.println(s);
        System.out.println("aaa".substring(0,3));
    }
}
