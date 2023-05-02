package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/search-a-2d-matrix-ii/">搜索二维矩阵 II</a>
 */
public class Solution_240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = n - 1;
        while (x < m && y >= 0) {
            int val = matrix[x][y];
            if (val == target) {
                return true;
            }
            if (val > target) {
                --y;
            } else {
                ++x;
            }
        }
        return false;
    }
}
