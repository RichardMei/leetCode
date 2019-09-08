package com.hbut.richard.leetcode;

/**
 * author Richard
 * date 2019-09-08 16:35
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = 0;
        int temp;

        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++ ) {
                temp =(j-i) * Math.min(height[i], height[j]);
                if (temp > max) {
                    max = temp;
                }
            }
        }

        return max;
    }

    public static int maxAreaPointerApproach(int[] height) {
        int max = 0, area;
        int pointLeft = 0;
        int pointRight = height.length - 1;

        for (int i=0; i < height.length; i++) {
            if (pointLeft >= pointRight) break;

            if ( height[pointLeft]> height[pointRight]) {
                area = (pointRight-pointLeft) * height[pointRight];
                pointRight -= 1;
            } else {
                area = (pointRight-pointLeft) * height[pointLeft];
                pointLeft += 1;
            }

            if (area > max) max = area;
        }

        return max;
    }
}
