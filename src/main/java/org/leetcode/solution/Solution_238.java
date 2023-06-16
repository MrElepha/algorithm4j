package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/product-of-array-except-self/">除自身以外数组的乘积</a>
 */
public class Solution_238 {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] res = new int[len];
//        正常思路
//        int[] prefix = new int[len];
//        int[] suffix = new int[len];
//
//        prefix[0] = 1;
//        for (int i = 1; i < len; ++i) {
//            prefix[i] = prefix[i - 1] * nums[i - 1];
//        }
//
//        suffix[len - 1] = 1;
//        for (int i = len - 2; i >= 0; --i) {
//            suffix[i] = suffix[i + 1] * nums[i + 1];
//        }
//
//        for (int i = 0; i < len; i++) {
//            res[i] = prefix[i] * suffix[i];
//        }
//
//        return res;
// 节约空间写法，prefix 作为结果存放，suffix 从右往左可抽象成 (n - 1) * (n - 2) * * * 1
        res[0] = 1;
        for (int i = 1; i < len; ++i) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = len - 1; i >= 0; --i) {
            res[i] = res[i] * suffix;
            suffix = suffix * nums[i];
        }
        return res;
    }
}
