package com.hbut.richard.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * author Richard
 * date 2020-09-20 15:00
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || (s.length() % 2 != 0)) return false;

        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')','(');
        mapping.put(']','[');
        mapping.put('}','{');


        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mapping.containsKey(c)) {
                char pop = stack.isEmpty()? '#':stack.pop();
                if (mapping.get(c) != pop) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
