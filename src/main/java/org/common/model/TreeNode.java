package org.common.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 根据数据序列化为二叉树
     *
     * @param input 给定输入数组
     * @return 构造好的二叉树
     */
    public static TreeNode init(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(input.get(0));
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        boolean isLeft = true;
        int inputLen = input.size();
        for (int i = 1; i < inputLen; i++) {
            TreeNode node = Objects.requireNonNull(queue.peek());
            Integer val = input.get(i);
            if (isLeft) {
                if (val != null) {
                    node.left = new TreeNode(val);
                    queue.addLast(node.left);
                }
                isLeft = false;
            } else {
                if (val != null) {
                    node.right = new TreeNode(val);
                    queue.addLast(node.right);
                }
                queue.removeFirst();
                isLeft = true;
            }
        }
        return root;
    }
}
