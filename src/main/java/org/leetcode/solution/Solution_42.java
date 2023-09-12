package org.leetcode.solution;


/**
 * <a href="https://leetcode.cn/problems/trapping-rain-water/description/">接雨水</a>
 */
public class Solution_42 {

    public int trap(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            // leftMax 左边最大值，rightMax 右边最大值
            // 左边柱子能接的雨水量 min(lLeftMax, lRightMax) - h[l]
            // 右边柱子能接的雨水量 min(rLeftMax, rRightMax) - h[r]

            // 按从左往右的关系，rLeftMax >= lLeftMax，lRightMax >= rRightMax
            // lLeftMax > rRightMax => rLeftMax >= rRightMax 能接 r 点雨水 => leftMax > rightMax 能接 r 点雨水
            // rRightMax > lLeftMax => lRightMax >= lLeftMax 能接 l 点雨水 => rightMax > leftMax 能接 l 点雨水
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) { // leftMax < rightMax
                res += leftMax - height[left];
                ++left;
            } else { // leftMax >= rightMax
                res += rightMax - height[right];
                --right;
            }
        }
        return res;
    }
}
