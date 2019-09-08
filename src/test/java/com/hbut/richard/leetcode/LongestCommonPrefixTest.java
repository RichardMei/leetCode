package com.hbut.richard.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * author Richard
 * date 2019-09-08 22:20
 */
public class LongestCommonPrefixTest {
    @Test
    public void test_1() {
        String[] input = {"flower","flow","flight"};

        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    public void test_2() {
        String[] input = {"dog","racecar","car"};

        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    public void test_3() {
        String[] input = {""};

        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    public void test_4() {
        String[] input = {"flower","flow","flight"};

        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefix_(input));
    }

    @Test
    public void test_5() {
        String[] input = {"dog","racecar","car"};

        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix_(input));
    }

    @Test
    public void test_6() {
        String[] input = {""};

        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix_(input));
    }
}
