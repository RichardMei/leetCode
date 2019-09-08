package com.hbut.richard.leetcode;

/**
 * author Richard
 * date 2019-09-08 12:53
 */
public class RegularExpressionMatching {

    /**
     * https://leetcode.com/problems/regular-expression-matching/
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {

        if (p.isEmpty()) return s.isEmpty();

        boolean isFirstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');

        if (p.length() > 1 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (isFirstMatch && isMatch(s.substring(1), p));
        } else {
            return isFirstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static boolean isMatchDp(String s, String p) {
        int sl = s.length();
        int pl = p.length();

        boolean[][] dp = new boolean[sl + 1][pl + 1];
        dp[0][0] = true;

        for (int i = 2; i <= pl; i++) {
            if (p.charAt(i-1) == '*') {
                dp[0][i] = dp[0][i-2];
            }
        }

        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= pl; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                if (sc == pc || pc == '.') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (pc == '*') {
                    if (dp[i][j -2 ]) {
                        dp[i][j] = true;
                    } else if (sc == p.charAt(j - 2) || p.charAt(j -2 ) == '.') {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }

        return dp[sl][pl];
    }

}
