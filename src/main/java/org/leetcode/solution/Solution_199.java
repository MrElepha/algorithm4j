package org.leetcode.solution;

import org.common.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/binary-tree-right-side-view/">二叉树的右视图</a>
 */
public class Solution_199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> cur = new LinkedList<>();
        cur.addLast(root);
        while (!cur.isEmpty()) {
            int cnt = cur.size();
            for (int i = 0; i < cnt; ++i) {
                TreeNode node = cur.removeFirst();
                if (i == cnt - 1) {
                    res.add(node.val);
                }
                if (node.left != null) {
                    cur.addLast(node.left);
                }
                if (node.right != null) {
                    cur.addLast(node.right);
                }
            }
        }
        return res;
    }
}
