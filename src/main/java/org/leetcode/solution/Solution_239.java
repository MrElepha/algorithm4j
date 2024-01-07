package org.leetcode.solution;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/sliding-window-maximum/description/">滑动窗口最大值</a>
 */
public class Solution_239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int l = 1 - k, r = 0; r < nums.length; ++l, ++r) {
            // 删除 deque 中对应的 nums[l-1]
            if (l > 0 && deque.peekFirst() == nums[l - 1]) {
                deque.removeFirst();
            }
            // deque 单调递减
            while (!deque.isEmpty() && deque.peekLast() < nums[r]) {
                deque.removeLast();
            }
            deque.addLast(nums[r]);
            // 记录窗口最大值
            if (l >= 0) {
                res[l] = deque.peekFirst();
            }
        }

        return res;
    }
}
