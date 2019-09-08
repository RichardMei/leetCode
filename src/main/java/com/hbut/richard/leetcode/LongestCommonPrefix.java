package com.hbut.richard.leetcode;

/**
 * author Richard
 * date 2019-09-08 22:08
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || "".equals(strs[0])) return "";

        String first = strs[0];
        boolean mark = false;
        String prefix = null;

        for (int i=1; i<=first.length();i++) {
            prefix= first.substring(0,i);
            for (int j=1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    mark = true;
                }
            }
            if (mark) {
                prefix= first.substring(0,i-1);
                break;
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix_(String[] strs) {
        if (strs.length == 0 || "".equals(strs[0])) return "";

        String prefix = strs[0];

        for (int i=1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) prefix="";
            }
        }

        return prefix;
    }
}
