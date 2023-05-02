package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/search-in-rotated-sorted-array/">搜索旋转排序数组</a>
 */
public class Solution_33 {

    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // mid 处于左侧
            if (nums[0] < nums[mid]) {
                // 升序阶段
                if (nums[0] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 升序阶段
                if (nums[len - 1] >= target && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
