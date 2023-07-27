package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/removing-stars-from-a-string/">从字符串中移除星号</a>
 */
public class Solution_2390 {

    public String removeStars(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int writeCnt = 0;
        for (char c : charArray) {
            if (c == '*') {
                if (writeCnt > 0) {
                    sb.deleteCharAt(--writeCnt);
                }
            } else {
                sb.append(c);
                writeCnt++;
            }
        }
        return sb.toString();
    }
}
