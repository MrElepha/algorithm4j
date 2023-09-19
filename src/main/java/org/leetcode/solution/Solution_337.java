package org.leetcode.solution;

import org.common.model.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/house-robber-iii/">打家劫舍 III</a>
 */
public class Solution_337 {

//    Map<TreeNode, Integer> selected = new HashMap<>();
//    Map<TreeNode, Integer> unSelected = new HashMap<>();
//
//    public int rob(TreeNode root) {
//        postOrderTravel(root);
//        return Math.max(
//                selected.getOrDefault(root, 0),
//                unSelected.getOrDefault(root, 0)
//        );
//    }
//
//    // 后续遍历，从下往上将权重集中到当前节点
//    public void postOrderTravel(TreeNode node) {
//        if (node == null) {
//            return;
//        }
//
//        postOrderTravel(node.left);
//        postOrderTravel(node.right);
//
//        // 当前节点选中，子节点不选中
//        selected.put(node, node.val + unSelected.getOrDefault(node.left, 0) + unSelected.getOrDefault(node.right, 0));
//        // 不选中当前节点，值等于左节点权重（选中或者不选中的较大值）和右节点权重的和
//        unSelected.put(node,
//                Math.max(selected.getOrDefault(node.left, 0), unSelected.getOrDefault(node.left, 0))
//                + Math.max(selected.getOrDefault(node.right, 0), unSelected.getOrDefault(node.right, 0))
//        );
//    }

    // 空间优化，从下往上最终只用到两个数据集
    public int rob(TreeNode root) {
        int[] pair = postOrderTravel(root);
        return Math.max(pair[0], pair[1]);
    }

    // 后续遍历，返回 [selectedMax, unSelectMax]
    public int[] postOrderTravel(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] leftPair = postOrderTravel(node.left);
        int[] rightPair = postOrderTravel(node.right);
        int selected = node.val + leftPair[1] + rightPair[1];
        int unSelected = Math.max(leftPair[0], leftPair[1]) + Math.max(rightPair[0], rightPair[1]);
        return new int[]{selected, unSelected};
    }

}
