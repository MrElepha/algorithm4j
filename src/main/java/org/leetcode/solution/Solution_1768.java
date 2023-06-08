package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/merge-strings-alternately/">交替合并字符串</a>
 */
public class Solution_1768 {

    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int m = chars1.length;
        int n = chars2.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m || i < n; ++i) {
            if (i < m) {
                sb.append(chars1[i]);
            }
            if (i < n) {
                sb.append(chars2[i]);
            }
        }
        return sb.toString();
    }
}
