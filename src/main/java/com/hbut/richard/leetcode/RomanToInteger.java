package com.hbut.richard.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * author Richard
 * date 2019-09-08 18:14
 */
public class RomanToInteger {
    public static int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        int num = 0;

        int i = 0, j = i+1;
        while (i < s.length()) {

            if (j == s.length()) {
                num += map.get(String.valueOf(s.charAt(i)));
                break;
            }

            if (map.get(String.valueOf(s.charAt(i))) >= map.get(String.valueOf(s.charAt(j)))) {
                num += map.get(String.valueOf(s.charAt(i)));
                i++;
            } else {
                num += map.get(s.substring(i,i+2));
                i=i+2;
            }
            j = i+1;
        }

        return num;
    }

    public static int romanToInt_(String s) {

        int num = 0;

        for (int i=0; i < s.length()-1; i++) {
            int current = getVal(s.charAt(i));
            int next = getVal(s.charAt(i+1));
            if (current >= next) {
                num += current;
            } else {
                num -= current;
            }
        }

        return num + getVal(s.charAt(s.length()-1));
    }

    private static int getVal(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
