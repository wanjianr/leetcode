package com.douye;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        Map<Character,Character> map  = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                Character pop = stack.isEmpty() ? '#' : stack.pop();
                if (map.get(c) != pop) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char left = stack.pop();
                if (left == '[' && c != ']') return false;
                if (left == '{' && c != '}') return false;
                if (left == '(' && c != ')') return false;
            }
        }
        return stack.isEmpty();
    }
}
