package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/search-insert-position/">搜索插入位置</a>
 */
public class Solution_35 {

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
