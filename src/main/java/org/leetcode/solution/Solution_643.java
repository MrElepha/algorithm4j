package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/maximum-average-subarray-i/">子数组最大平均数 I</a>
 */
public class Solution_643 {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; ++i) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(sum, maxSum);
        }

        return 1.0 * maxSum / k;
    }
}
