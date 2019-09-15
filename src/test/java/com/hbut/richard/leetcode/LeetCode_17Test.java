package com.hbut.richard.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * author Richard
 * date 2019-09-15 13:55
 */
public class LeetCode_17Test {
    @Test
    public void test_1() {
        List<String> output = LeetCode_17.letterCombinations("23456789");
        System.out.println(output);
    }

    @Test
    public void test_2() {
        List<String> output = LeetCode_17.letterCombinations_("23456789");
        System.out.println(output);
    }
}
