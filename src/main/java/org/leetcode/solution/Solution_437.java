package org.leetcode.solution;

import org.common.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/path-sum-iii/description/">路径总和 III</a>
 */
public class Solution_437 {

    // 递归方法
    public int pathSum1(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        // 当前节点自顶向下满足条件的个数
        int ret = rootSum(root, targetSum);
        // 左子树满足条件个数
        ret += pathSum1(root.left, targetSum);
        // 右子树满足条件个数
        ret += pathSum1(root.right, targetSum);
        return ret;
    }

    /**
     * 当前节点自顶向下满足条件的个数
     * @param root 当前节点
     * @param targetSum 已算出来的和，这里设置 long，防止减法计算溢出
     * @return 个数
     */
    private static int rootSum(TreeNode root, long targetSum) {
        int ret = 0;
        if (root == null) {
            return 0;
        }
        int val = root.val;
        // 当前节点刚好等于结果
        if (val == targetSum) {
            ++ret;
        }

        ret += rootSum(root.left, targetSum - val);
        ret += rootSum(root.right, targetSum - val);
        return ret;
    }

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<>();
        // 当targetSum 等于某个节点值时，curPrefix - targetSum = 0,
        // 当前节点自己就算做一条符合条件的路径，所以也要计数
        prefix.put(0L, 1);
        return dfs(root, prefix, 0L, targetSum);
    }

    public static int dfs(TreeNode root, Map<Long, Integer> prefix, long cur, int targetSum) {
        int res = 0;
        if (root == null) {
            return res;
        }

        // 当前节点前缀和
        cur += root.val;
        // 加上符合条件的个数
        res += prefix.getOrDefault(cur - targetSum, 0);

        // 记录当前节点前缀和 & 遍历子节点
        prefix.put(cur, prefix.getOrDefault(cur, 0) + 1);
        res += dfs(root.left, prefix, cur, targetSum);
        res += dfs(root.right, prefix, cur, targetSum);

        // 当前节点没有路径关系的节点，不需要当前节点的前缀和
        prefix.put(cur, prefix.getOrDefault(cur, 0) - 1);
        return res;
    }
}
