package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/container-with-most-water/">盛最多水的容器</a>
 */
public class Solution_11 {

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r) {
            if (height[r] > height[l]) {
                res = Math.max((r - l) * height[l++], res);
            } else {
                res = Math.max((r - l) * height[r--], res);
            }
        }
        return res;
    }
}
