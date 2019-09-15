package com.hbut.richard.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * author Richard
 * date 2019-09-14 19:56
 */
public class ThreeSumClosestTest {
    @Test
    public void test() {
        int[] nums = {-1, 2, 1, -4};
        Assert.assertEquals(2,ThreeSumClosest.threeSumClosest(nums, 1));
    }

    @Test
    public void test_1() {
        int[] nums = {0,2,1,-3};
        Assert.assertEquals(0,ThreeSumClosest.threeSumClosest(nums, 1));
    }
}
