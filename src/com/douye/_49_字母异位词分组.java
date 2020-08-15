package com.douye;

import java.util.*;

public class _49_字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String string = String.valueOf(chars);
            if (!map.containsKey(string)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(string,list);
            } else
                map.get(string).add(str);
        }
        List<List<String>> lists = new ArrayList<>();
        for (List<String> value : map.values()) {
            lists.add(value);
        }
        return lists;
    }

    public static void main(String[] args) {
        _49_字母异位词分组 l = new _49_字母异位词分组();
        List<List<String>> lists = l.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(lists.toString());
    }
}
