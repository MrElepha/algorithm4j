package org.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/subarray-sum-equals-k/description/">和为 K 的子数组</a>
 */
public class Solution_560 {

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // 初始化前缀和为0的次数为1

        for (int num : nums) {
            sum += num; // 前 i 个数之和
            if (map.containsKey(sum - k)) { // 前 j 个数到前 i 个数的差为 k
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
