package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/greatest-common-divisor-of-strings/">字符串的最大公因子</a>
 */
public class Solution_1071 {

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int targetLen = Math.min(len1, len2);
        for (; targetLen > 0; --targetLen) {
            String targetStr = str1.substring(0, targetLen);
            if (check(targetStr, str1) && check(targetStr, str2)) {
                return targetStr;
            }
        }
        return "";
    }

    public boolean check(String target, String input) {
        int inputLen = input.length();
        int targetLen = target.length();
        if (inputLen % targetLen != 0) {
            return false;
        }
        int start = 0;
        StringBuilder sb = new StringBuilder();
        while (start < inputLen) {
            sb.append(target);
            start += targetLen;
        }
        return sb.toString().equals(input);
    }
}
