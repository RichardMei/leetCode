package com.hbut.richard.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * author Richard
 * date 2019-09-08 13:43
 */
public class RegularExpressionMatchingTest {

    @Test
    public void test_1() {
        Assert.assertFalse(RegularExpressionMatching.isMatch("aa", "a"));
    }

    @Test
    public void test_2() {
        Assert.assertTrue(RegularExpressionMatching.isMatch("aa", "a*"));
    }

    @Test
    public void test_3() {
        Assert.assertTrue(RegularExpressionMatching.isMatch("aab", "c*a*b"));
    }

    @Test
    public void test_4() {
        Assert.assertFalse(RegularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    public void test_5() {
        Assert.assertTrue(RegularExpressionMatching.isMatch("ab", ".*"));
    }

    @Test
    public void test_6() {
        Assert.assertFalse(RegularExpressionMatching.isMatchDp("aa", "a"));
    }

    @Test
    public void test_7() {
        Assert.assertTrue(RegularExpressionMatching.isMatchDp("aa", "a*"));
    }

    @Test
    public void test_8() {
        Assert.assertTrue(RegularExpressionMatching.isMatchDp("aab", "c*a*b"));
    }

    @Test
    public void test_9() {
        Assert.assertFalse(RegularExpressionMatching.isMatchDp("mississippi", "mis*is*p*."));
    }

    @Test
    public void test_10() {
        Assert.assertTrue(RegularExpressionMatching.isMatchDp("ab", ".*"));
    }
}
