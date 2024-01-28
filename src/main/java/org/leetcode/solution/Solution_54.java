package org.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/spiral-matrix/description/">螺旋矩阵</a>
 */
public class Solution_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        // 左边界
        int left = 0;
        // 右边界
        int right = colLen - 1;
        // 上边界
        int top = 0;
        // 下边界
        int bottom = rowLen - 1;
        // 二维数组中的元素总数
        int cnt = rowLen * colLen;
        while (cnt > 0) {
            // 左上 -> 右上
            for (int i = left; i <= right && cnt > 0; i++) {
                res.add(matrix[top][i]);
                cnt--;
            }
            top++;
            // 右上 -> 右下
            for (int i = top; i <= bottom && cnt > 0; i++) {
                res.add(matrix[i][right]);
                cnt--;
            }
            right--;
            // 右下 -> 左下
            for (int i = right; i >= left && cnt > 0; i--) {
                res.add(matrix[bottom][i]);
                cnt--;
            }
            bottom--;
            // 左下 -> 左上
            for (int i = bottom; i >= top && cnt > 0; i--) {
                res.add(matrix[i][left]);
                cnt--;
            }
            left++;
        }

        return res;
    }
}
