package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/">定长子串中元音的最大数目</a>
 */
public class Solution_1456 {

    public int maxVowels(String s, int k) {
        int cur = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < k; ++i) {
            cur += isVowel(array[i]);
        }

        int res = cur;
        for (int i = k; i < array.length; ++i) {
            cur += isVowel(array[i]) - isVowel(array[i - k]);
            res = Math.max(cur, res);
        }
        return res;
    }

    public static int isVowel(char ch) {
        return (ch == 'a'
                || ch == 'e'
                || ch == 'i'
                || ch == 'o'
                || ch == 'u')
                ? 1 : 0;
    }
}
