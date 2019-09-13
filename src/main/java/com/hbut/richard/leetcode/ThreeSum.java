package com.hbut.richard.leetcode;

import java.util.*;

/**
 * author Richard
 * date 2019-09-08 22:41
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 &&
                            !isExist(result, nums[i], nums[j], nums[k])) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;
    }

    private static boolean isExist(List<List<Integer>> list, int i, int j, int k) {
        boolean exist = false;
        List<Integer> temp = Arrays.asList(i, j ,k);
        Collections.sort(temp);
        for (List<Integer> ints : list) {
            Collections.sort(ints);
            if (ints.get(0) == temp.get(0) && ints.get(1) == temp.get(1) && ints.get(2) == temp.get(2)) {
                exist = true;
                break;
            }

        }
        return exist;
    }


    public static List<List<Integer>> threeSum_(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < nums.length-2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = len -1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else {
                    if (nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        result.addAll(set);
        return result;
    }
}
