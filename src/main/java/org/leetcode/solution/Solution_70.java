package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/climbing-stairs/">爬楼梯</a>
 */
public class Solution_70 {

    public int climbStairs(int n) {
        // dp[n-2]
        int preOfPre = 0;
        // dp[n-1]
        int pre = 0;
        // dp[n]
        int cur = 1;
        for (int i = 1; i <= n; ++i) {
            preOfPre = pre;
            pre = cur;
            // dp[n] = dp[n-1] + dp[n-2]
            cur = preOfPre + pre;
        }
        return cur;
    }
}
