package org.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/">无重复字符的最长子串</a>
 */
public class Solution_3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int l = 0;
        char[] sArray = s.toCharArray();
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(sArray[i])) {
                // 从不重复的字母算起，往后移一位
                l = Math.max(l, map.get(sArray[i]) + 1);
            }
            map.put(sArray[i], i);
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}
