package com.hbut.richard.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * author Richard
 * date 2019-09-08 16:43
 */
public class ContainerWithMostWaterTest {

    @Test
    public void test_1() {
        int[] height = {1,8,6,2,5,4,8,3,7};

        Assert.assertEquals(49, ContainerWithMostWater.maxArea(height));
    }

    @Test
    public void test_2() {
        int[] height = {1,1};

        Assert.assertEquals(1, ContainerWithMostWater.maxArea(height));
    }

    @Test
    public void test_3() {
        int[] height = {1,8,6,2,5,4,8,3,7};

        Assert.assertEquals(49, ContainerWithMostWater.maxAreaPointerApproach(height));
    }

    @Test
    public void test_4() {
        int[] height = {1,1};

        Assert.assertEquals(1, ContainerWithMostWater.maxAreaPointerApproach(height));
    }
}
