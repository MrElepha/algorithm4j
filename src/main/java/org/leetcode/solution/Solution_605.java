package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/can-place-flowers/">种花问题</a>
 */
public class Solution_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int len = flowerbed.length;
        while (i < len && n > 0) {
            if (flowerbed[i] == 1) {
                i = i + 2;
            } else if (i == len - 1 || flowerbed[i + 1] == 0) {
                // 最后一个格子了
                n--;
                i = i + 2;
            } else {
                // 当前空了，但是下个位置有花了，直接跳三格
                i = i + 3;
            }
        }
        return n <= 0;
    }
}
