package org.leetcode.solution;

import org.common.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/longest-zigzag-path-in-a-binary-tree/description/">二叉树中的最长交错路径</a>
 */
public class Solution_1372 {

    private int res = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, 0, 0);
        return res;
    }

    private void dfs(TreeNode root, int l, int r) {
        if (root == null) {
            return;
        }
        res = Math.max(res, Math.max(l, r));
        dfs(root.left, r + 1, 0);
        dfs(root.right, 0, l + 1);
    }
}
