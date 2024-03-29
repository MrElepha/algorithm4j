package org.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/find-all-anagrams-in-a-string/description/">找到字符串中所有字母异位词</a>
 */
public class Solution_438 {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        List<Integer> ans = new ArrayList<>();

        if (sLen < pLen) {
            return ans;
        }

        int[] sCount = new int[26];
        int[] pCount = new int[26];
        int i = 0;
        for (; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (; i < sLen; ++i) {
            --sCount[s.charAt(i - pLen) - 'a'];
            ++sCount[s.charAt(i) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i - pLen + 1);
            }
        }

        return ans;
    }
}
