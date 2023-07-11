package org.leetcode.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/unique-number-of-occurrences/">独一无二的出现次数</a>
 */
public class Solution_1207 {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> cntMap = new HashMap<>();
        for (int i : arr) {
            cntMap.put(i, cntMap.getOrDefault(i, 0) + 1);
        }

        Set<Integer> timesSet = new HashSet<>(cntMap.values());
        return timesSet.size() == cntMap.size();
    }
}
