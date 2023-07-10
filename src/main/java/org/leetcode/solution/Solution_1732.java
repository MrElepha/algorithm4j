package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/find-the-highest-altitude/">找到最高海拔</a>
 */
public class Solution_1732 {

    public int largestAltitude(int[] gain) {
        int res = 0;
        int sum = 0;
        for (int x : gain) {
            sum += x;
            res = Math.max(res, sum);
        }
        return res;
    }
}
