package org.leetcode.solution;


import org.common.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/description/">二叉树的最近公共祖先</a>
 */
public class Solution_236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) { // 当前根节点是 p 或者 q，不能继续往下(继续往下不算公共祖先了)
            return root;
        }

        // 继续往下迭代
        TreeNode leftAncestor = lowestCommonAncestor(root.left, p, q);
        TreeNode rightAncestor = lowestCommonAncestor(root.right, p, q);

        // p 和 q 都没有找到
        if (leftAncestor == null && rightAncestor == null) {
            return null;
        }
        // 左边没有 p、q
        if (leftAncestor == null) {
            return rightAncestor;
        }
        // 右边没有 p、q
        if (rightAncestor == null) {
            return leftAncestor;
        }
        // 左边右边都找到了，那 root 就是根节点
        return root;
    }
}
