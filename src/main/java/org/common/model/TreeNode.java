package org.common.model;

import org.leetcode.solution.Solution_144;
import org.leetcode.solution.Solution_94;

import java.util.*;

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

    /**
     * 将二叉树转成 map<val, treeNode>
     */
    public Map<Integer, TreeNode> toMap() {
        Map<Integer, TreeNode> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(this);
        while (!stack.isEmpty()) {
            TreeNode parent = stack.pop();
            map.put(parent.val, parent);
            if (parent.left != null) {
                stack.push(parent.left);
            }
            if (parent.right != null) {
                stack.push(parent.right);
            }
        }
        return map;
    }

    private static final Solution_144 PREORDER_PRINTER = new Solution_144();
    private static final Solution_94 INORDER_PRINTER = new Solution_94();

    /**
     * 先序遍历输出
     */
    public List<Integer> preorderPrint() {
        return PREORDER_PRINTER.preorderTraversal(this);
    }

    /**
     * 中序遍历输出
     */
    public List<Integer> inorderPrint() {
        return INORDER_PRINTER.inorderTraversal(this);
    }
}
