package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/rotate-array/description/">轮转数组</a>
 */
public class Solution_189 {

    public void rotate(int[] nums, int k) {
        // 使用额外的数组
//        int n = nums.length;
//        int[] newArr = new int[n];
//        for (int i = 0; i < n; ++i) {
//            newArr[(i + k) % n] = nums[i];
//        }
//        System.arraycopy(newArr, 0, nums, 0, n);


        // 数组反转
        k %= nums.length;
        // 翻转所有元素
        reverse(nums, 0, nums.length - 1);
        // 翻转 [0, k mod n−1] 区间的元素
        reverse(nums, 0, k - 1);
        // 翻转 [k mod n,n−1] 区间的元素
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            ++l;
            --r;
        }
    }
}
