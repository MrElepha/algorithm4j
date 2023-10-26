package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/maximum-subarray/description/">最大子数组和</a>
 */
public class Solution_53 {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int x : nums) {
            // 前面加起来还是负数
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
