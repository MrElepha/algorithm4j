package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/find-pivot-index/">寻找数组的中心下标</a>
 */
public class Solution_724 {

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int len = nums.length;
        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < len; ++i) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
