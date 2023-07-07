package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/max-consecutive-ones-iii/">最大连续1的个数 III</a>
 */
public class Solution_1004 {

    public int longestOnes(int[] nums, int k) {
        // 转换为「找出一个最长的子数组，该子数组内最多允许有 K 个 0」
        int l = 0;
        int zeros = 0;
        int res = 0;
        for (int r = 0; r < nums.length; ++r) {
            if (nums[r] == 0) {
                ++zeros;
            }
            while (zeros > k) {
                if (nums[l++] == 0) {
                    --zeros;
                }
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
