import org.common.model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.solution.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCodeSolutionTest {

    private static String formatSolutionLabel(int solutionNum, String solutionTitle) {
        return String.format("Solution_%04d: %s\n", solutionNum, solutionTitle);
    }

    /**
     * 两数之和
     *
     * @see org.leetcode.solution.Solution_1#twoSum
     */
    @Test
    void testSolution_1() {
        System.out.printf(formatSolutionLabel(1, "两数之和"));
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution_1 solution = new Solution_1();
        int[] res = solution.twoSum(nums, target);
        Assertions.assertEquals(nums[res[0]] + nums[res[1]], target);
    }

    /**
     * 盛最多水的容器
     *
     * @see org.leetcode.solution.Solution_11#maxArea
     */
    @Test
    void testSolution_11() {
        System.out.printf(formatSolutionLabel(11, "盛最多水的容器"));
        Solution_11 solution = new Solution_11();
        Assertions.assertEquals(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assertions.assertEquals(solution.maxArea(new int[]{1, 1}), 1);
    }

    /**
     * 搜索旋转排序数组
     *
     * @see org.leetcode.solution.Solution_33#search
     */
    @Test
    void testSolution_33() {
        System.out.printf(formatSolutionLabel(33, "搜索旋转排序数组"));
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        Solution_33 solution = new Solution_33();
        int res = solution.search(nums, target);
        Assertions.assertEquals(4, res);

        target = 3;
        res = solution.search(nums, target);
        Assertions.assertEquals(-1, res);
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     *
     * @see org.leetcode.solution.Solution_34#searchRange
     */
    @Test
    void testSolution_34() {
        System.out.printf(formatSolutionLabel(34, "在排序数组中查找元素的第一个和最后一个位置"));
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        Solution_34 solution = new Solution_34();
        int[] res = solution.searchRange(nums, target);
        Assertions.assertTrue(res[0] == 3 && res[1] == 4);

        target = 6;
        res = solution.searchRange(nums, target);
        Assertions.assertTrue(res[0] == -1 && res[1] == -1);
    }

    /**
     * 搜索插入位置
     *
     * @see org.leetcode.solution.Solution_35#searchInsert
     */
    @Test
    void testSolution_35() {
        System.out.printf(formatSolutionLabel(35, "搜索插入位置"));
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        Solution_35 solution = new Solution_35();
        int res = solution.searchInsert(nums, target);
        Assertions.assertEquals(res, 2);

        target = 2;
        res = solution.searchInsert(nums, target);
        Assertions.assertEquals(res, 1);

        target = 7;
        res = solution.searchInsert(nums, target);
        Assertions.assertEquals(res, 4);
    }


    /**
     * x 的平方根
     *
     * @see org.leetcode.solution.Solution_69#mySqrt
     */
    @Test
    void testSolution_69() {
        System.out.printf(formatSolutionLabel(69, "x 的平方根"));
        Solution_69 solution = new Solution_69();
        Assertions.assertEquals(solution.mySqrt(4), 2);

        Assertions.assertEquals(solution.mySqrt(8), 2);
    }

    /**
     * 爬楼梯
     *
     * @see org.leetcode.solution.Solution_70#climbStairs
     */
    @Test
    void testSolution_70() {
        System.out.printf(formatSolutionLabel(70, "爬楼梯"));
        Solution_70 solution = new Solution_70();
        Assertions.assertEquals(solution.climbStairs(2), 2);
        Assertions.assertEquals(solution.climbStairs(45), 1836311903);
    }

    /**
     * 搜索二维矩阵
     *
     * @see org.leetcode.solution.Solution_74#searchMatrix
     */
    @Test
    void testSolution_74() {
        System.out.printf(formatSolutionLabel(74, "搜索二维矩阵"));
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        Solution_74 solution = new Solution_74();
        boolean res = solution.searchMatrix(matrix, target);
        Assertions.assertTrue(res);

        target = 13;
        res = solution.searchMatrix(matrix, target);
        Assertions.assertFalse(res);
    }

    /**
     * 二叉树的中序遍历
     *
     * @see org.leetcode.solution.Solution_94#inorderTraversal
     */
    @Test
    void testSolution_94() {
        System.out.printf(formatSolutionLabel(94, "二叉树的中序遍历"));
        List<Integer> input = Arrays.asList(1, null, 2, 3);
        Solution_94 solution = new Solution_94();
        List<Integer> res = solution.inorderTraversal(TreeNode.init(input));
        Assertions.assertTrue(res.get(0) == 1 && res.get(1) == 3 && res.get(2) == 2);

        input = Collections.singletonList(1);
        res = solution.inorderTraversal(TreeNode.init(input));
        Assertions.assertEquals(1, (int) res.get(0));

        input = Collections.emptyList();
        res = solution.inorderTraversal(TreeNode.init(input));
        Assertions.assertTrue(res.isEmpty());
    }

    /**
     * 反转字符串中的单词
     *
     * @see org.leetcode.solution.Solution_151#reverseWords
     */
    @Test
    void testSolution_151() {
        System.out.printf(formatSolutionLabel(151, "反转字符串中的单词"));
        Solution_151 solution = new Solution_151();
        Assertions.assertEquals(solution.reverseWords("the sky is blue"), "blue is sky the");
        Assertions.assertEquals(solution.reverseWords("  hello world  "), "world hello");
        Assertions.assertEquals(solution.reverseWords("a good   example"), "example good a");
    }

    /**
     * 除自身以外数组的乘积
     *
     * @see org.leetcode.solution.Solution_238#productExceptSelf
     */
    @Test
    void testSolution_238() {
        System.out.printf(formatSolutionLabel(238, "除自身以外数组的乘积"));
        Solution_238 solution = new Solution_238();
        int[] res = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        Assertions.assertEquals(res[0], 24);
        Assertions.assertEquals(res[1], 12);
        Assertions.assertEquals(res[2], 8);
        Assertions.assertEquals(res[3], 6);

        res = solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        Assertions.assertEquals(res[0], 0);
        Assertions.assertEquals(res[1], 0);
        Assertions.assertEquals(res[2], 9);
        Assertions.assertEquals(res[3], 0);
        Assertions.assertEquals(res[4], 0);
    }

    /**
     * 搜索二维矩阵
     *
     * @see org.leetcode.solution.Solution_240#searchMatrix
     */
    @Test
    void testSolution_240() {
        System.out.printf(formatSolutionLabel(240, "搜索二维矩阵"));
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        Solution_240 solution = new Solution_240();
        boolean res = solution.searchMatrix(matrix, target);
        Assertions.assertTrue(res);

        target = 20;
        res = solution.searchMatrix(matrix, target);
        Assertions.assertFalse(res);
    }

    /**
     * 移动零
     *
     * @see org.leetcode.solution.Solution_283#moveZeroes
     */
    @Test
    void testSolution_283() {
        System.out.printf(formatSolutionLabel(283, "移动零"));
        Solution_283 solution = new Solution_283();

        int[] res = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(res);
        Assertions.assertArrayEquals(res, new int[]{1, 3, 12, 0, 0});

        res = new int[]{0};
        solution.moveZeroes(res);
        Assertions.assertArrayEquals(res, new int[]{0});
    }

    /**
     * 递增的三元子序列
     *
     * @see org.leetcode.solution.Solution_334#increasingTriplet
     */
    @Test
    void testSolution_334() {
        System.out.printf(formatSolutionLabel(334, "递增的三元子序列"));
        Solution_334 solution = new Solution_334();
        Assertions.assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        Assertions.assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    /**
     * 反转字符串中的元音字母
     *
     * @see org.leetcode.solution.Solution_345#reverseVowels
     */
    @Test
    void testSolution_345() {
        System.out.printf(formatSolutionLabel(345, "反转字符串中的元音字母"));
        Solution_345 solution = new Solution_345();
        Assertions.assertEquals(solution.reverseVowels("hello"), "holle");
        Assertions.assertEquals(solution.reverseVowels("leetcode"), "leotcede");
    }

    /**
     * 判断子序列
     *
     * @see org.leetcode.solution.Solution_392#isSubsequence
     */
    @Test
    void testSolution_392() {
        System.out.printf(formatSolutionLabel(392, "判断子序列"));
        Solution_392 solution = new Solution_392();
        Assertions.assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        Assertions.assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

    /**
     * 压缩字符串
     *
     * @see org.leetcode.solution.Solution_443#compress
     */
    @Test
    void testSolution_443() {
        System.out.printf(formatSolutionLabel(443, "压缩字符串"));
        Solution_443 solution = new Solution_443();
        Assertions.assertEquals(solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}), 6);
        Assertions.assertEquals(solution.compress(new char[]{'a'}), 1);
        Assertions.assertEquals(solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}), 4);
    }

    /**
     * 种花问题
     *
     * @see org.leetcode.solution.Solution_605#canPlaceFlowers
     */
    @Test
    void testSolution_605() {
        System.out.printf(formatSolutionLabel(605, "种花问题"));
        int[] nums = new int[]{1, 0, 0, 0, 1};
        Solution_605 solution = new Solution_605();
        Assertions.assertTrue(solution.canPlaceFlowers(nums, 1));

        Assertions.assertFalse(solution.canPlaceFlowers(nums, 2));
    }


    /**
     * 子数组最大平均数 I
     *
     * @see org.leetcode.solution.Solution_643#findMaxAverage
     */
    @Test
    void testSolution_643() {
        System.out.printf(formatSolutionLabel(643, "子数组最大平均数 I"));
        Solution_643 solution = new Solution_643();
        Assertions.assertEquals(solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 12.75);
        Assertions.assertEquals(solution.findMaxAverage(new int[]{5}, 1), 5.00000);
    }

    /**
     * 二分查找
     *
     * @see org.leetcode.solution.Solution_704#search
     */
    @Test
    void testSolution_704() {
        System.out.printf(formatSolutionLabel(704, "二分查找"));
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        Solution_704 solution = new Solution_704();
        int res = solution.search(nums, target);
        Assertions.assertEquals(res, 4);

        target = 2;
        res = solution.search(nums, target);
        Assertions.assertEquals(res, -1);
    }

    /**
     * 寻找数组的中心下标
     *
     * @see org.leetcode.solution.Solution_724#pivotIndex
     */
    @Test
    void testSolution_724() {
        System.out.printf(formatSolutionLabel(724, "寻找数组的中心下标"));

        Solution_724 solution = new Solution_724();
        Assertions.assertEquals(solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}), 3);
        Assertions.assertEquals(solution.pivotIndex(new int[]{1, 2, 3}), -1);
        Assertions.assertEquals(solution.pivotIndex(new int[]{2, 1, -1}), 0);
    }

    /**
     * 最大连续1的个数 III
     *
     * @see org.leetcode.solution.Solution_1004#longestOnes
     */
    @Test
    void testSolution_1004() {
        System.out.printf(formatSolutionLabel(1004, "最大连续1的个数 III"));
        Solution_1004 solution = new Solution_1004();
        Assertions.assertEquals(
                solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2),
                6
        );

        Assertions.assertEquals(
                solution.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3),
                10
        );
    }

    /**
     * 字符串的最大公因子
     *
     * @see org.leetcode.solution.Solution_1071#gcdOfStrings
     */
    @Test
    void testSolution_1071() {
        System.out.printf(formatSolutionLabel(1071, "字符串的最大公因子"));
        Solution_1071 solution = new Solution_1071();
        Assertions.assertEquals(solution.gcdOfStrings("ABCABC", "ABC"), "ABC");
        Assertions.assertEquals(solution.gcdOfStrings("ABABAB", "ABAB"), "AB");
        Assertions.assertEquals(solution.gcdOfStrings("LEET", "CODE"), "");
    }

    /**
     * 拥有最多糖果的孩子
     *
     * @see org.leetcode.solution.Solution_1431#kidsWithCandies
     */
    @Test
    void testSolution_1431() {
        System.out.printf(formatSolutionLabel(1431, "拥有最多糖果的孩子"));
        Solution_1431 solution = new Solution_1431();
        int[] input = new int[]{2, 3, 5, 1, 3};
        List<Boolean> res = solution.kidsWithCandies(input, 3);
        Assertions.assertTrue(res.get(0));
        Assertions.assertTrue(res.get(1));
        Assertions.assertTrue(res.get(2));
        Assertions.assertFalse(res.get(3));
        Assertions.assertTrue(res.get(4));
    }

    /**
     * 定长子串中元音的最大数目
     *
     * @see org.leetcode.solution.Solution_1456#maxVowels
     */
    @Test
    void testSolution_1456() {
        System.out.printf(formatSolutionLabel(1456, "定长子串中元音的最大数目"));
        Solution_1456 solution = new Solution_1456();
        Assertions.assertEquals(solution.maxVowels("abciiidef", 3), 3);
        Assertions.assertEquals(solution.maxVowels("aeiou", 2), 2);
        Assertions.assertEquals(solution.maxVowels("leetcode", 3), 2);
        Assertions.assertEquals(solution.maxVowels("rhythms", 4), 0);
    }

    /**
     * 删掉一个元素以后全为 1 的最长子数组
     *
     * @see org.leetcode.solution.Solution_1493#longestSubarray
     */
    @Test
    void testSolution_1493() {
        System.out.printf(formatSolutionLabel(1493, "删掉一个元素以后全为 1 的最长子数组"));
        Solution_1493 solution = new Solution_1493();
        Assertions.assertEquals(solution.longestSubarray(new int[]{1, 1, 0, 1}), 3);
        Assertions.assertEquals(solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}), 5);
        Assertions.assertEquals(solution.longestSubarray(new int[]{1, 1, 1}), 2);
    }

    /**
     * K 和数对的最大数目
     *
     * @see org.leetcode.solution.Solution_1679#maxOperations
     */
    @Test
    void testSolution_1679() {
        System.out.printf(formatSolutionLabel(1679, "K 和数对的最大数目"));
        Solution_1679 solution = new Solution_1679();
        Assertions.assertEquals(solution.maxOperations(new int[]{1, 2, 3, 4}, 5), 2);
        Assertions.assertEquals(solution.maxOperations(new int[]{3, 1, 3, 4, 3}, 6), 1);
    }

    /**
     * 找到最高海拔
     *
     * @see org.leetcode.solution.Solution_1732#largestAltitude
     */
    @Test
    void testSolution_1732() {
        System.out.printf(formatSolutionLabel(1732, "找到最高海拔"));
        Solution_1732 solution = new Solution_1732();
        Assertions.assertEquals(solution.largestAltitude(new int[]{-5, 1, 5, 0, -7}), 1);
    }

    /**
     * 交替合并字符串
     *
     * @see org.leetcode.solution.Solution_1768#mergeAlternately
     */
    @Test
    void testSolution_1768() {
        System.out.printf(formatSolutionLabel(1768, "交替合并字符串"));
        Solution_1768 solution = new Solution_1768();
        Assertions.assertEquals(solution.mergeAlternately("abc", "pqr"), "apbqcr");
        Assertions.assertEquals(solution.mergeAlternately("ab", "pqrs"), "apbqrs");
        Assertions.assertEquals(solution.mergeAlternately("abcd", "pq"), "apbqcd");
    }
}
