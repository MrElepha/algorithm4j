package org.leetcode.solution;

import org.common.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/count-good-nodes-in-binary-tree/description/">统计二叉树中好节点的数目</a>
 */
public class Solution_1448 {

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private static int dfs(TreeNode root, int pathMax) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val >= pathMax) {
            res++;
            pathMax = root.val;
        }
        res += dfs(root.left, pathMax) + dfs(root.right, pathMax);
        return res;
    }
}
