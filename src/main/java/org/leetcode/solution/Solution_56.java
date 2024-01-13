package org.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/merge-intervals/description/">合并区间</a>
 */
public class Solution_56 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            int l = interval[0];
            int r = interval[1];
            int mergedSize = merged.size();
            if (mergedSize == 0 || merged.get(mergedSize - 1)[1] < l) {
                merged.add(new int[]{l, r});
            } else {
                merged.get(mergedSize - 1)[1] = Math.max(merged.get(mergedSize - 1)[1], r);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
