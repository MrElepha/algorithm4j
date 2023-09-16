package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/house-robber/description/">打家劫舍</a>
 */
public class Solution_198 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // dp[-1] = 0，前两个点
        int prev2 = 0;
        // dp[0] = nums[0]，前一个点
        int prev1 = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            // dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1])
            int tmp = Math.max(nums[i] + prev2, prev1);

            // 转到下个点
            prev2 = prev1;
            prev1 = tmp;
        }

        return prev1;
    }
}
