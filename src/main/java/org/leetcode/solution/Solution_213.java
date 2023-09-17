package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/house-robber-ii/description/">打家劫舍 II</a>
 */
public class Solution_213 {

    private int[] nums;

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        this.nums = nums;
        return Math.max(robRange(0, nums.length - 1), robRange(1, nums.length));
    }

    // start <= i < end

    /**
     * @see Solution_198#rob
     */
    public int robRange(int start, int end) {
        int pre2 = 0;
        int prev1 = nums[start];
        for (int i = start + 1; i < end; ++i) {
            // dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]
            int tmp = Math.max(nums[i] + pre2, prev1);

            // next
            pre2 = prev1;
            prev1 = tmp;
        }

        return prev1;
    }
}
