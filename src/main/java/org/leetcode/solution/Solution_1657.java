package org.leetcode.solution;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/determine-if-two-strings-are-close/">确定两个字符串是否接近</a>
 */
public class Solution_1657 {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> times1 = new HashMap<>();
        Map<Character, Integer> times2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            times1.put(c, times1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            times2.put(c, times2.getOrDefault(c, 0) + 1);
        }

        int size = times1.size();
        if (times2.size() != size) {
            return false;
        }

        List<Integer> cnt1 = new ArrayList<>();
        List<Integer> cnt2 = new ArrayList<>();
        // 种类一致
        for (Map.Entry<Character, Integer> entry : times1.entrySet()) {
            char c = entry.getKey();
            Integer v1 = entry.getValue();
            Integer v2 = times2.get(c);
            if (v2 == null) {
                return false;
            }
            cnt1.add(v1);
            cnt2.add(v2);
        }

        Collections.sort(cnt1);
        Collections.sort(cnt2);
        // 种类个数一致
        for (int i = 0; i < size; ++i) {
            if (!Objects.equals(cnt1.get(i), cnt2.get(i))) {
                return false;
            }
        }

        return true;
    }
}
