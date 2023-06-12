package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/reverse-vowels-of-a-string/">反转字符串中的元音字母</a>
 */
public class Solution_345 {

    // 元音字母枚举
    public static final String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {
        int len = s.length();
        int left = 0;
        int right = len - 1;
        char[] charArray = s.toCharArray();
        while (left < right) {
            while (left < len && notVowel(charArray[left])) {
                ++left;
            }
            while (right > 0 && notVowel(charArray[right])) {
                --right;
            }
            if (left < right) {
                swap(charArray, left, right);
                ++left;
                --right;
            }
        }
        return new String(charArray);
    }

    public boolean notVowel(char c) {
        return VOWELS.indexOf(c) < 0;
    }

    public void swap(char[] input, int left, int right) {
        char tmp = input[left];
        input[left] = input[right];
        input[right] = tmp;
    }
}
