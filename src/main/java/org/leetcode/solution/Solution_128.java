package org.leetcode.solution;

import java.util.HashSet;

/**
 * <a href="https://leetcode.cn/problems/longest-consecutive-sequence/description/">最长连续序列</a>
 */
public class Solution_128 {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int res = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curNum = n;
                int curRes = 1;
                while (set.contains(curNum + 1)) {
                    curNum += 1;
                    ++curRes;
                }

                res = Math.max(curRes, res);
            }
        }

        return res;
    }
}
