package com.hbut.richard.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * author Richard
 * date 2019-09-08 21:32
 */
public class RomanToIntegerTest {
    @Test
    public void test_1() {
        Assert.assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    public void test_2() {
        Assert.assertEquals(58, RomanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void test_3() {
        Assert.assertEquals(3, RomanToInteger.romanToInt("III"));
    }

    @Test
    public void test_4() {
        Assert.assertEquals(4, RomanToInteger.romanToInt("IV"));
    }

    @Test
    public void test_5() {
        Assert.assertEquals(1994, RomanToInteger.romanToInt_("MCMXCIV"));
    }

    @Test
    public void test_6() {
        Assert.assertEquals(58, RomanToInteger.romanToInt_("LVIII"));
    }

    @Test
    public void test_7() {
        Assert.assertEquals(3, RomanToInteger.romanToInt_("III"));
    }

    @Test
    public void test_8() {
        Assert.assertEquals(4, RomanToInteger.romanToInt_("IV"));
    }
}
