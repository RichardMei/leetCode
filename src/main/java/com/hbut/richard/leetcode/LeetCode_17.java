package com.hbut.richard.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author Richard
 * date 2019-09-14 20:21
 * Letter Combinations of a Phone Number
 */
public class LeetCode_17 {
    static Map<String, String[]> dict = new HashMap<>(8);

    static {
        String[] num_2 = {"a", "b", "c"};
        dict.put("2", num_2);

        String[] num_3 = {"d", "e", "f"};
        dict.put("3", num_3);

        String[] num_4 = {"g", "h", "i"};
        dict.put("4", num_4);

        String[] num_5 = {"j", "k", "l"};
        dict.put("5", num_5);

        String[] num_6 = {"m", "n", "o"};
        dict.put("6", num_6);

        String[] num_7 = {"p", "q", "r", "s"};
        dict.put("7", num_7);

        String[] num_8 = {"t", "u", "v"};
        dict.put("8", num_8);

        String[] num_9 = {"w", "x", "y", "z"};
        dict.put("9", num_9);

    }


    public static List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if (!digits.isEmpty()) backTrace("", digits, output);
        return output;
    }

    private static void backTrace(String combinations , String nextDigits, List output) {
        if (nextDigits.isEmpty()) {
            output.add(combinations);
        } else {
            String digit = nextDigits.substring(0,1);
            String[] letters = dict.get(digit);
            for (int i = 0; i < letters.length; i++) {
                String letter = letters[i];
                backTrace(combinations + letter, nextDigits.substring(1), output);
            }
        }
    }

    public static List<String> letterCombinations_(String digits) {
        List<String> ans = new ArrayList<String>();
        if(digits==null || digits.isEmpty()) return ans;

        char[][] map = new char[8][];
        map[0]="abc".toCharArray();
        map[1]="def".toCharArray();
        map[2]="ghi".toCharArray();
        map[3]="jkl".toCharArray();
        map[4]="mno".toCharArray();
        map[5]="pqrs".toCharArray();
        map[6]="tuv".toCharArray();
        map[7]="wxyz".toCharArray();

        char[] digi = digits.toCharArray();
        ans.add("");
        for (int i = 0; i < digi.length; i++) {
            ans = expand(ans, map[digi[i] - '2']);
        }

        return ans;
    }

    private static List<String> expand(List<String> l,char[] arr)
    {
        List<String> next = new ArrayList<String>();
        for(String s:l)
            for(char c:arr)
                next.add(s+c);
        return next;
    }
}
