package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/move-zeroes/">移动零</a>
 */
public class Solution_283 {

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int l = 0;
        for (int r = 0; r < len; ++r) {
            if (nums[r] != 0) {
                // l 左侧全是非 0 值
                swap(nums, l, r);
                l++;
            }
        }
    }

    public void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
