package com.douye;

import java.util.ArrayList;
import java.util.List;

public class _17_电话号码的字母组合 {
    String[] string_map = new String[] {""," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1) return res;
        dfs(digits,0,"");
        return res;
    }

    public void dfs(String str, int index, String letter) {
        if (str.length() == index) {
            res.add(letter);
            return;
        }
        char c = str.charAt(index);
        String map = string_map[c-'0'];
        for (int i = 0; i < map.length(); i++) {
            dfs(str,index+1,letter+map.charAt(i));
        }
    }
}
