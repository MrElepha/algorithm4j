package org.leetcode.solution;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/max-number-of-k-sum-pairs/">K 和数对的最大数目</a>
 */
public class Solution_1679 {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int ans = 0;
        while (l < r) {
            int res = nums[l] + nums[r];
            if (res > k) {
                r--;
            } else if (res < k) {
                l++;
            } else {
                ans++;
                l++;
                r--;
            }
        }
        return ans;
    }
}