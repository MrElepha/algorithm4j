package org.leetcode.solution;

import javafx.util.Pair;
import org.common.model.TreeNode;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/maximum-width-of-binary-tree/description/">二叉树最大宽度</a>
 */
public class Solution_662 {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<Pair<TreeNode,Integer>> curr = new LinkedList<>();
        curr.add(new Pair<>(root, 1));
        int res = 1;
        while (!curr.isEmpty()) {
            int size = curr.size();
            res = Math.max(res,
                    // 最大编号 - 最小编号 + 1
                    curr.get(size - 1).getValue() - curr.get(0).getValue() + 1
            );
            for (int i = 0; i < size; ++ i) {
                Pair<TreeNode, Integer> nodePair = curr.removeFirst();
                TreeNode node = nodePair.getKey();
                int index = nodePair.getValue();
                if (node.left != null) {
                    // 编号为 index 的左子节点的编号为 2*index
                    curr.addLast(new Pair<>(node.left, 2 * index));
                }
                if (node.right != null) {
                    // 编号为 index 的右子节点的编号为 2*index + 1
                    curr.addLast(new Pair<>(node.right, 2*index +1));
                }
            }
        }
        return res;
    }
}
