package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/">删掉一个元素以后全为 1 的最长子数组</a>
 */
public class Solution_1493 {

    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int res = 0;
        int cnt = 1;
        while (r < nums.length) {
            if (nums[r] == 1) {
                ++r;
            } else if (nums[r] == 0 && cnt <= 1) {
                ++r;
                ++cnt;
            } else {
                while (cnt > 1) {
                    if (nums[l++] == 0) {
                        --cnt;
                    }
                }
            }
            // 符合条件最大长度
            res = Math.max(res, r - l);
        }
        // 结果减去 1
        return res > 0 ? res - 1 : 0;
    }
}
