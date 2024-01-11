package org.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/minimum-window-substring/description/">最小覆盖子串</a>
 */
public class Solution_76 {

    public String minWindow(String s, String t) {
        char[] tArray = t.toCharArray();
        char[] sArray = s.toCharArray();
        Map<Character, Integer> need = new HashMap<>(tArray.length);
        Map<Character, Integer> window = new HashMap<>();
        for (char c : tArray) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = 0;
        int validLen = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        while (r < sArray.length) {
            char rCur = sArray[r];
            ++r;
            // 右边界判断
            if (need.containsKey(rCur)) {
                window.put(rCur, window.getOrDefault(rCur, 0) + 1);
                if (window.get(rCur).equals(need.get(rCur))) {
                    ++validLen;
                }
            }
            // 左边界判断
            while(need.size() == validLen) {
                if (r - l < minLen) {
                    start = l;
                    minLen = r - l;
                }
                // 左边收缩
                char lCur = sArray[l];
                ++l;
                if (window.containsKey(lCur)) {
                   if (window.get(lCur).equals(need.get(lCur))) {
                       --validLen;
                   }
                   window.put(lCur, window.get(lCur) - 1);
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
