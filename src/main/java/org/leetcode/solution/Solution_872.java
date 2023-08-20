package org.leetcode.solution;

import org.common.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/leaf-similar-trees/description/">叶子相似的树</a>
 */
public class Solution_872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        dfs(root1, leaf1);
        List<Integer> leaf2 = new ArrayList<>();
        dfs(root2, leaf2);
        return leaf1.equals(leaf2);
    }

    public void dfs(TreeNode node, List<Integer> leaf) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leaf.add(node.val);
            return;
        }
        dfs(node.left, leaf);
        dfs(node.right, leaf);
    }
}
