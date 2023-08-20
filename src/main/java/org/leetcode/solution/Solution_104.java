package org.leetcode.solution;

import org.common.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/">二叉树的最大深度</a>
 */
public class Solution_104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
