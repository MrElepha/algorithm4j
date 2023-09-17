package org.leetcode.solution;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/group-anagrams/description/">字母异位词分组</a>
 */
public class Solution_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> curList = resMap.getOrDefault(key, new ArrayList<>());
            curList.add(s);
            resMap.put(key, curList);
        }

        return new ArrayList<>(resMap.values());
    }
}
