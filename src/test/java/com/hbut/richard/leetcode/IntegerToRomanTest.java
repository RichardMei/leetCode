package com.hbut.richard.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * author Richard
 * date 2019-09-08 18:05
 */
public class IntegerToRomanTest {
    @Test
    public void test_1() {
        Assert.assertEquals("MCMXCIV", IntegerToRoman.intToRoman(1994));
    }
}
