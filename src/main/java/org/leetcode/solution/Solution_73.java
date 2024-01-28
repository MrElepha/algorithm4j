package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/set-matrix-zeroes/description/">矩阵置零</a>
 */
public class Solution_73 {

    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int columnLen = matrix[0].length;
        boolean[] rowExist = new boolean[rowLen];
        boolean[] columnExist = new boolean[columnLen];
        for (int i = 0; i < rowLen; ++i) {
            for (int j = 0; j < columnLen; ++j) {
                if (matrix[i][j] == 0) {
                    rowExist[i] = true;
                    columnExist[j] = true;
                }
            }
        }

        for (int i = 0; i < rowLen; ++i) {
            for (int j = 0; j < columnLen; ++j) {
                if (rowExist[i] || columnExist[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
