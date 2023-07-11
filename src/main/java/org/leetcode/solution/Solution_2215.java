package org.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/find-the-difference-of-two-arrays/">找出两数组的不同</a>
 */
public class Solution_2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }

        HashSet<Integer> res1 = new HashSet<>();
        HashSet<Integer> res2 = new HashSet<>();
        for (int i : nums1) {
            if (!set2.contains(i)) {
                res1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                res2.add(i);
            }
        }
        return Arrays.asList(new ArrayList<>(res1), new ArrayList<>(res2));
    }
}
