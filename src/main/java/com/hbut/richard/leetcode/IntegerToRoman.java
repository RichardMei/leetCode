package com.hbut.richard.leetcode;

/**
 * author Richard
 * date 2019-09-08 17:54
 */
public class IntegerToRoman {
    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i] && num > 0) {
                num -= values[i];
                result.append(romans[i]);
            }
        }

        return result.toString();
    }
}
