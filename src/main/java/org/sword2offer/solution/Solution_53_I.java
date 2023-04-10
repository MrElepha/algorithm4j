package org.sword2offer.solution;

/**
 * <a href="https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/">剑指 Offer 53 - I. 在排序数组中查找数字 I</a>
 */
public class Solution_53_I {

    public int search(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (target == nums[i]) {
                ++res;
            }
            if (i > 0 && target > nums[i - 1] && target < nums[i]) {
                break;
            }
        }
        return res;
    }
}
