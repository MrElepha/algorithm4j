package org.leetcode.solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.cn/problems/equal-row-and-column-pairs/">相等行列对</a>
 */
public class Solution_2352 {

    public int equalPairs(int[][] grid) {
        int res = 0;
        Map<String, Integer> cnt = new HashMap<>();
        for (int[] row: grid) {
            String key = Arrays.stream(row)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("|"));
            cnt.put(key, cnt.getOrDefault(key, 0) + 1);
        }

        int n = grid.length;
        for (int i = 0; i < n; ++i) {
            List<String> column = new ArrayList<>();
            for (int j = 0; j < n; ++j) {
                column.add(String.valueOf(grid[j][i]));
            }
            String key = String.join("|", column);
            res += cnt.getOrDefault(key, 0);
        }
        return res;
    }
}
