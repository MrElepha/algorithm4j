package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/first-missing-positive/description/">缺失的第一个正数</a>
 */
public class Solution_41 {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            // 把在[1,n]范围内的nums[i]置换到正确位置上
            // nums[i] 所在位置为 nums[nums[i] - 1]
            // eg 1,2,3 nums[0] = 1，1应在 nums[1-1]上
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // [1,n]都在数组正确位置上，返回 n+1
        return n + 1;
    }
}
