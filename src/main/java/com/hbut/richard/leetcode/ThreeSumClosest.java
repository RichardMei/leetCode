package com.hbut.richard.leetcode;

import java.util.Arrays;

/**
 * author Richard
 * date 2019-09-14 19:52
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int curSum = nums[i] + nums[left] + nums[right];
                if (curSum == target) return curSum;
                if (Math.abs(target - curSum) < Math.abs(target - closest)) closest = curSum;
                if (curSum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return closest;
    }
}
