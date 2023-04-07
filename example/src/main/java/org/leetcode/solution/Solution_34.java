package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/">在排序数组中查找元素的第一个和最后一个位置</a>
 */
public class Solution_34 {

    public int[] searchRange(int[] nums, int target) {
        // default res
        int[] defaultRes = new int[]{-1, -1};
        int length = nums.length;
        if (length == 0) {
            return defaultRes;
        }
        int l = 0;
        int r = length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < target) {
                // 搜索区间变为 [m + 1, r]
                l = m + 1;
            } else if (nums[m] > target) {
                // 搜素区间变为 [l, m - 1]
                r = m - 1;
            } else {
                int lIndex = m;
                int rIndex = m;
                // 左侧边界
                while (l < lIndex && nums[lIndex] == nums[lIndex - 1]) {
                    --lIndex;
                }
                // 右侧边界
                while (r > rIndex && nums[rIndex] == nums[rIndex + 1]) {
                    ++rIndex;
                }
                return new int[]{lIndex, rIndex};
            }
        }
        return defaultRes;
    }
}
