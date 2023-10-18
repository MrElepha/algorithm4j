package org.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/3sum/description/">三数之和</a>
 */
public class Solution_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int first = 0; first < n; ++first) {
            if (nums[first] > 0) {
                break;
            }
            // 去重
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int second = first + 1;
            int third = n - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[first], nums[second], nums[third]));
                    // 左边去重
                    while (second < third && nums[second] == nums[second + 1]) {
                        ++second;
                    }
                    // 右边去重
                    while (second < third && nums[third] == nums[third - 1]) {
                        --third;
                    }
                    ++second;
                    --third;
                } else if (sum < 0) {
                    ++second;
                } else {
                    --third;
                }
            }
        }
        return ans;
    }
}
