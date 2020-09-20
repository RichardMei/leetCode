package com.hbut.richard.leetcode;

import java.util.*;

/**
 * author Richard
 * date 2020-09-20 11:38
 */
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < len - 3; i++) {
            for (int j = len - 1; j > i + 2 ; j--) {
                int tmp = target - nums[i] - nums[j];
                int left = i + 1;
                int right = j - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum > tmp) {
                        right--;
                    } else if (sum < tmp) {
                        left++;
                    } else {
                      set.add(Arrays.asList(nums[i], nums[left], nums[right], nums[j]));
                      left++;
                      right--;
                    }
                }
            }
        }
        result.addAll(set);
        return result;
    }

    public static void main(String[] args) {
        //-2,-1,0,0,1,2
        System.out.println(fourSum(new int[] {1, 0, -1, 0 , -2, 2}, 0));
    }
}
