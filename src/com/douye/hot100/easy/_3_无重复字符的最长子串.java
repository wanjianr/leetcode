package com.douye.hot100.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2020-07-14 11:35:47
 */
public class _3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Map<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start,map.get(c)+1);
            }
            max = Math.max(max,end-start+1);
            map.put(s.charAt(end),end);
        }
        return max;
    }

}
