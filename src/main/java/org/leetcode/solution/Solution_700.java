package org.leetcode.solution;

import org.common.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/search-in-a-binary-search-tree/description/">二叉搜索树中的搜索</a>
 */
public class Solution_700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        return searchBST(root.val < val ? root.right : root.left, val);
    }
}
