package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/increasing-triplet-subsequence/">递增的三元子序列</a>
 */
public class Solution_334 {

    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        for (int i = 1; i < len; ++i) {
            if (nums[i] > second) {
                return true;
            } else if (nums[i] > first) {
                second = nums[i];
            } else {
                first = nums[i];
            }
        }
        return false;
    }
}
