package org.leetcode.solution;

import org.common.model.TreeNode;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/maximum-level-sum-of-a-binary-tree/">最大层内元素和</a>
 */
public class Solution_1161 {

    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> cur = new LinkedList<>();
        cur.add(root);
        int res = 1;
        int curLevel = 1;
        int maxVal = root.val;
        while (!cur.isEmpty()) {
           int size = cur.size();
           int sum = 0;
           for (int i = 0; i < size; ++i) {
               TreeNode node = cur.removeFirst();
               sum+= node.val;
               if (node.left != null) {
                   cur.addLast(node.left);
               }
               if (node.right != null) {
                   cur.addLast(node.right);
               }
           }
           if (maxVal < sum) {
               maxVal = sum;
               res = curLevel;
           }
            ++curLevel;
        }

        return res;
    }
}
