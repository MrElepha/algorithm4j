package org.leetcode.solution;

import org.common.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/delete-node-in-a-bst/description/">删除二叉搜索树中的节点</a>
 */
public class Solution_450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.val < key) {
            // 去右子树删
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            // 去左子树删
            root.left = deleteNode(root.left, key);
        } else { // 当前节点就是需要删除的节点
            if (root.left == null) { // 删除节点没有左子树
                return root.right;
            }
            if (root.right == null) { // 删除节点没有右子树
                return root.left;
            }
            // 寻找右子树的最左边节点
            TreeNode min = root.right;
            while (min.left != null) {
                min = min.left;
            }
            // 将需删除的节点的左子树变成删除节点的右子树的最左节点的左子树
            min.left = root.left;
            // 原删除节点的右子树顶替现在位置
            root = root.right;
        }
        return root;
    }
}
