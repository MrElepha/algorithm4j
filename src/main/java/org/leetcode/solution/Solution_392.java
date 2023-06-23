package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/is-subsequence/">判断子序列</a>
 */
public class Solution_392 {

    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
