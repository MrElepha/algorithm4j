import org.common.model.ListNode;
import org.common.model.TreeNode;
import org.junit.jupiter.api.*;
import org.leetcode.solution.*;

import java.util.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LeetCodeSolutionTest {

    private static String formatSolutionLabel(int solutionNum, String solutionTitle) {
        return String.format("Solution_%04d: %s\n", solutionNum, solutionTitle);
    }

    /**
     * 最大子数组和
     *
     * @see org.leetcode.solution.Solution_1#twoSum
     */
    @Test
    @Order(1)
    void testSolution_1() {
        System.out.printf(formatSolutionLabel(1, "两数之和"));
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution_1 solution = new Solution_1();
        int[] res = solution.twoSum(nums, target);
        Assertions.assertEquals(nums[res[0]] + nums[res[1]], target);
    }

    /**
     * 无重复字符的最长子串
     *
     * @see org.leetcode.solution.Solution_3#lengthOfLongestSubstring
     */
    @Test
    @Order(3)
    void testSolution_3() {
        System.out.printf(formatSolutionLabel(3, "无重复字符的最长子串"));
        Solution_3 solution = new Solution_3();
        Assertions.assertEquals(solution.lengthOfLongestSubstring("abcabcbb"), 3);
        Assertions.assertEquals(solution.lengthOfLongestSubstring("bbbbb"), 1);
        Assertions.assertEquals(solution.lengthOfLongestSubstring("pwwkew"), 3);
    }

    /**
     * 盛最多水的容器
     *
     * @see org.leetcode.solution.Solution_11#maxArea
     */
    @Test
    @Order(11)
    void testSolution_11() {
        System.out.printf(formatSolutionLabel(11, "盛最多水的容器"));
        Solution_11 solution = new Solution_11();
        Assertions.assertEquals(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assertions.assertEquals(solution.maxArea(new int[]{1, 1}), 1);
    }

    /**
     * 三数之和
     *
     * @see org.leetcode.solution.Solution_15#threeSum
     */
    @Test
    @Order(15)
    void testSolution_15() {
        System.out.printf(formatSolutionLabel(15, "三数之和"));
        Solution_15 solution = new Solution_15();
        Assertions.assertEquals(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}), Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
        Assertions.assertEquals(solution.threeSum(new int[]{0, 1, 1}), new ArrayList<>());
        Assertions.assertEquals(solution.threeSum(new int[]{0, 0, 0}), Collections.singletonList(Arrays.asList(0, 0, 0)));
    }

    /**
     * 搜索旋转排序数组
     *
     * @see org.leetcode.solution.Solution_33#search
     */
    @Test
    @Order(33)
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
    @Order(34)
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
    @Order(35)
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
     * 接雨水
     *
     * @see org.leetcode.solution.Solution_42#trap(int[])
     */
    @Test
    @Order(42)
    void testSolution_42() {
        System.out.printf(formatSolutionLabel(42, "接雨水"));
        Solution_42 solution = new Solution_42();
        Assertions.assertEquals(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
        Assertions.assertEquals(solution.trap(new int[]{4, 2, 0, 3, 2, 5}), 9);
    }

    /**
     * 字母异位词分组
     *
     * @see org.leetcode.solution.Solution_49#groupAnagrams
     */
    @Test
    @Order(49)
    void testSolution_49() {
        System.out.printf(formatSolutionLabel(49, "字母异位词分组"));
        Solution_49 solution = new Solution_49();
        Assertions.assertEquals(
                solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}),
                Arrays.asList(
                        Arrays.asList("eat", "tea", "ate"),
                        Collections.singletonList("bat"),
                        Arrays.asList("tan", "nat")
                )
        );
    }

    /**
     * 最大子数组和
     *
     * @see org.leetcode.solution.Solution_53#maxSubArray
     */
    @Test
    @Order(53)
    void testSolution_53() {
        System.out.printf(formatSolutionLabel(53, "最大子数组和"));
        Solution_53 solution = new Solution_53();
        Assertions.assertEquals(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
        Assertions.assertEquals(solution.maxSubArray(new int[]{1}), 1);
        Assertions.assertEquals(solution.maxSubArray(new int[]{5, 4, -1, 7, 8}), 23);
    }

    /**
     * x 的平方根
     *
     * @see org.leetcode.solution.Solution_69#mySqrt
     */
    @Test
    @Order(69)
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
    @Order(70)
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
    @Order(74)
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
     * 复原 IP 地址
     *
     * @see org.leetcode.solution.Solution_93#restoreIpAddresses
     */
    @Test
    @Order(93)
    void testSolution_93() {
        System.out.printf(formatSolutionLabel(93, "复原 IP 地址"));
        Solution_93 solution = new Solution_93();
        Assertions.assertEquals(solution.restoreIpAddresses("25525511135"), Arrays.asList("255.255.11.135", "255.255.111.35"));
        Assertions.assertEquals(solution.restoreIpAddresses("0000"), Collections.singletonList("0.0.0.0"));
        Assertions.assertEquals(solution.restoreIpAddresses("101023"), Arrays.asList("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"));
    }

    /**
     * 二叉树的中序遍历
     *
     * @see org.leetcode.solution.Solution_94#inorderTraversal
     */
    @Test
    @Order(94)
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
     * 二叉树的最大深度
     *
     * @see org.leetcode.solution.Solution_104#maxDepth
     */
    @Test
    @Order(104)
    void testSolution_104() {
        System.out.printf(formatSolutionLabel(104, "二叉树的最大深度"));
        Solution_104 solution = new Solution_104();
        Assertions.assertEquals(solution.maxDepth(TreeNode.init(Arrays.asList(3, 9, 20, null, null, 15, 7))), 3);
        Assertions.assertEquals(solution.maxDepth(TreeNode.init(Arrays.asList(1, null, 2))), 2);
    }

    /**
     * 最长连续序列
     *
     * @see org.leetcode.solution.Solution_128#longestConsecutive
     */
    @Test
    @Order(128)
    void testSolution_128() {
        System.out.printf(formatSolutionLabel(128, "最长连续序列"));
        Solution_128 solution = new Solution_128();
        Assertions.assertEquals(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}), 4);
        Assertions.assertEquals(solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}), 9);
    }

    /**
     * 二叉树的前序遍历
     *
     * @see org.leetcode.solution.Solution_144#preorderTraversal
     */
    @Test
    @Order(144)
    void testSolution_144() {
        System.out.printf(formatSolutionLabel(144, "二叉树的前序遍历"));
        Solution_144 solution = new Solution_144();
        Assertions.assertEquals(solution.preorderTraversal(TreeNode.init(Arrays.asList(1, null, 2, 3))), Arrays.asList(1, 2, 3));
    }

    /**
     * 二叉树的后序遍历
     *
     * @see org.leetcode.solution.Solution_145#postorderTraversal
     */
    @Test
    @Order(145)
    void testSolution_145() {
        System.out.printf(formatSolutionLabel(145, "二叉树的后序遍历"));
        Solution_145 solution = new Solution_145();
        Assertions.assertEquals(solution.postorderTraversal(TreeNode.init(Arrays.asList(1, null, 2, 3))), Arrays.asList(3, 2, 1));
    }

    /**
     * LRU 缓存
     *
     * @see org.leetcode.solution.Solution_146.LRUCache
     */
    @Test
    @Order(146)
    void testSolution_146() {
        System.out.printf(formatSolutionLabel(146, "LRU 缓存"));
        Solution_146.LRUCache lRUCache = new Solution_146.LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        Assertions.assertEquals(lRUCache.get(1), 1);
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        Assertions.assertEquals(lRUCache.get(2), -1);
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        Assertions.assertEquals(lRUCache.get(1), -1);
        Assertions.assertEquals(lRUCache.get(3), 3);
        Assertions.assertEquals(lRUCache.get(4), 4);
    }

    /**
     * 反转字符串中的单词
     *
     * @see org.leetcode.solution.Solution_151#reverseWords
     */
    @Test
    @Order(151)
    void testSolution_151() {
        System.out.printf(formatSolutionLabel(151, "反转字符串中的单词"));
        Solution_151 solution = new Solution_151();
        Assertions.assertEquals(solution.reverseWords("the sky is blue"), "blue is sky the");
        Assertions.assertEquals(solution.reverseWords("  hello world  "), "world hello");
        Assertions.assertEquals(solution.reverseWords("a good   example"), "example good a");
    }

    /**
     * 打家劫舍
     *
     * @see org.leetcode.solution.Solution_198#rob
     */
    @Test
    @Order(198)
    void testSolution_198() {
        System.out.printf(formatSolutionLabel(198, "打家劫舍"));
        Solution_198 solution = new Solution_198();
        Assertions.assertEquals(solution.rob(new int[]{1, 2, 3, 1}), 4);
        Assertions.assertEquals(solution.rob(new int[]{2, 7, 9, 3, 1}), 12);
    }

    /**
     * 二叉树的右视图
     *
     * @see org.leetcode.solution.Solution_199#rightSideView
     */
    @Test
    @Order(199)
    void testSolution_199() {
        System.out.printf(formatSolutionLabel(199, "二叉树的右视图"));
        Solution_199 solution = new Solution_199();
        Assertions.assertEquals(
                solution.rightSideView(TreeNode.init(Arrays.asList(1, 2, 3, null, 5, null, 4))),
                Arrays.asList(1, 3, 4)
        );
        Assertions.assertEquals(
                solution.rightSideView(TreeNode.init(Arrays.asList(1, null, 3))),
                Arrays.asList(1, 3)
        );
    }

    /**
     * 岛屿数量
     *
     * @see org.leetcode.solution.Solution_200#numIslands
     */
    @Test
    @Order(200)
    void testSolution_200() {
        System.out.printf(formatSolutionLabel(200, "岛屿数量"));
        Solution_200 solution = new Solution_200();
        char[][] input = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        Assertions.assertEquals(solution.numIslands(input), 1);
        char[][] input1 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        Assertions.assertEquals(solution.numIslands(input1), 3);
    }

    /**
     * 反转链表
     *
     * @see org.leetcode.solution.Solution_206#reverseList
     */
    @Test
    @Order(206)
    void testSolution_206() {
        System.out.printf(formatSolutionLabel(206, "反转链表"));
        Solution_206 solution = new Solution_206();
        Assertions.assertEquals(
                solution.reverseList(ListNode.init(Arrays.asList(1, 2, 3, 4, 5))).print(),
                ListNode.init(Arrays.asList(5, 4, 3, 2, 1)).print()
        );
    }

    /**
     * 打家劫舍 II
     *
     * @see org.leetcode.solution.Solution_213#rob
     */
    @Test
    @Order(206)
    void testSolution_213() {
        System.out.printf(formatSolutionLabel(213, "打家劫舍 II"));
        Solution_213 solution = new Solution_213();
        Assertions.assertEquals(solution.rob(new int[]{2, 3, 2}), 3);
        Assertions.assertEquals(solution.rob(new int[]{1, 2, 3, 1}), 4);
        Assertions.assertEquals(solution.rob(new int[]{1, 2, 3}), 3);
    }

    /**
     * 二叉树的最近公共祖先
     *
     * @see org.leetcode.solution.Solution_236#lowestCommonAncestor
     */
    @Test
    @Order(236)
    void testSolution_236() {
        System.out.printf(formatSolutionLabel(236, "二叉树的最近公共祖先"));
        Solution_236 solution = new Solution_236();
        TreeNode root = TreeNode.init(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        Map<Integer, TreeNode> treeMap = root.toMap();
        Assertions.assertEquals(
                solution.lowestCommonAncestor(root, treeMap.get(5), treeMap.get(1)),
                treeMap.get(3)
        );
        Assertions.assertEquals(
                solution.lowestCommonAncestor(root, treeMap.get(5), treeMap.get(4)),
                treeMap.get(5)
        );
    }

    /**
     * 除自身以外数组的乘积
     *
     * @see org.leetcode.solution.Solution_238#productExceptSelf
     */
    @Test
    @Order(238)
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
    @Order(240)
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
    @Order(283)
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
     * 去除重复字母
     *
     * @see org.leetcode.solution.Solution_316#removeDuplicateLetters
     */
    @Test
    @Order(316)
    void testSolution_316() {
        System.out.printf(formatSolutionLabel(316, "去除重复字母"));
        Solution_316 solution = new Solution_316();
        Assertions.assertEquals(solution.removeDuplicateLetters("bcabc"), "abc");
        Assertions.assertEquals(solution.removeDuplicateLetters("cbacdcbc"), "acdb");
    }

    /**
     * 奇偶链表
     *
     * @see org.leetcode.solution.Solution_328#oddEvenList
     */
    @Test
    @Order(328)
    void testSolution_328() {
        System.out.printf(formatSolutionLabel(328, "奇偶链表"));
        Solution_328 solution = new Solution_328();
        Assertions.assertEquals(
                solution.oddEvenList(ListNode.init(Arrays.asList(1, 2, 3, 4, 5))).print(),
                ListNode.init(Arrays.asList(1, 3, 5, 2, 4)).print()
        );
    }

    /**
     * 递增的三元子序列
     *
     * @see org.leetcode.solution.Solution_334#increasingTriplet
     */
    @Test
    @Order(334)
    void testSolution_334() {
        System.out.printf(formatSolutionLabel(334, "递增的三元子序列"));
        Solution_334 solution = new Solution_334();
        Assertions.assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        Assertions.assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    /**
     * 打家劫舍 III
     *
     * @see org.leetcode.solution.Solution_337#rob
     */
    @Test
    @Order(337)
    void testSolution_337() {
        System.out.printf(formatSolutionLabel(337, "打家劫舍 III"));
        Solution_337 solution = new Solution_337();
        Assertions.assertEquals(solution.rob(TreeNode.init(Arrays.asList(3, 2, 3, null, 3, null, 1))), 7);
        Assertions.assertEquals(solution.rob(TreeNode.init(Arrays.asList(3, 4, 5, 1, 3, null, 1))), 9);
    }

    /**
     * 反转字符串中的元音字母
     *
     * @see org.leetcode.solution.Solution_345#reverseVowels
     */
    @Test
    @Order(345)
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
    @Order(392)
    void testSolution_392() {
        System.out.printf(formatSolutionLabel(392, "判断子序列"));
        Solution_392 solution = new Solution_392();
        Assertions.assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        Assertions.assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

    /**
     * 字符串解码
     *
     * @see org.leetcode.solution.Solution_394#decodeString
     */
    @Test
    @Order(394)
    void testSolution_394() {
        System.out.printf(formatSolutionLabel(394, "字符串解码"));
        Solution_394 solution = new Solution_394();
        Assertions.assertEquals(solution.decodeString("3[a]2[bc]"), "aaabcbc");
        Assertions.assertEquals(solution.decodeString("3[a2[c]]"), "accaccacc");
        Assertions.assertEquals(solution.decodeString("2[abc]3[cd]ef"), "abcabccdcdcdef");
        Assertions.assertEquals(solution.decodeString("abc3[cd]xyz"), "abccdcdcdxyz");
    }

    /**
     * 路径总和 III
     *
     * @see org.leetcode.solution.Solution_437#pathSum1
     */
    @Test
    @Order(437)
    void testSolution_437() {
        System.out.printf(formatSolutionLabel(437, "路径总和 III"));
        Solution_437 solution = new Solution_437();
        // 递归测试
        Assertions.assertEquals(solution.pathSum1(TreeNode.init(Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)), 8), 3);
        Assertions.assertEquals(solution.pathSum1(TreeNode.init(Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1)), 22), 3);
        // 减法溢出测试
        Assertions.assertEquals(solution.pathSum1(TreeNode.init(Arrays.asList(1000000000, 1000000000, null, 294967296, null, 1000000000, null, 1000000000, null, 1000000000)), 0), 0);

        // 前缀和测试
        Assertions.assertEquals(solution.pathSum(TreeNode.init(Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)), 8), 3);
    }

    /**
     * 找到字符串中所有字母异位词
     *
     * @see org.leetcode.solution.Solution_438#findAnagrams
     */
    @Test
    @Order(438)
    void testSolution_438() {
        System.out.printf(formatSolutionLabel(438, "找到字符串中所有字母异位词"));
        Solution_438 solution = new Solution_438();

        Assertions.assertEquals(solution.findAnagrams("cbaebabacd", "abc"), Arrays.asList(0, 6));
        Assertions.assertEquals(solution.findAnagrams("abab", "ab"), Arrays.asList(0, 1, 2));
    }

    /**
     * 压缩字符串
     *
     * @see org.leetcode.solution.Solution_443#compress
     */
    @Test
    @Order(443)
    void testSolution_443() {
        System.out.printf(formatSolutionLabel(443, "压缩字符串"));
        Solution_443 solution = new Solution_443();
        Assertions.assertEquals(solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}), 6);
        Assertions.assertEquals(solution.compress(new char[]{'a'}), 1);
        Assertions.assertEquals(solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}), 4);
    }

    /**
     * 删除二叉搜索树中的节点
     *
     * @see org.leetcode.solution.Solution_450#deleteNode
     */
    @Test
    @Order(450)
    void testSolution_450() {
        System.out.printf(formatSolutionLabel(450, "删除二叉搜索树中的节点"));
        Solution_450 solution = new Solution_450();
        Assertions.assertEquals(
                solution.deleteNode(TreeNode.init(Arrays.asList(5, 3, 6, 2, 4, null, 7)), 3).inorderPrint(),
                Arrays.asList(2, 4, 5, 6, 7)
        );
        Assertions.assertEquals(
                solution.deleteNode(TreeNode.init(Arrays.asList(5, 3, 6, 2, 4, null, 7)), 0).inorderPrint(),
                Arrays.asList(2, 3, 4, 5, 6, 7)
        );
    }

    /**
     * 和为 K 的子数组
     *
     * @see org.leetcode.solution.Solution_560#subarraySum
     */
    @Test
    @Order(560)
    void testSolution_560() {
        System.out.printf(formatSolutionLabel(560, "和为 K 的子数组"));
        Solution_560 solution = new Solution_560();
        Assertions.assertEquals(solution.subarraySum(new int[]{1, 1, 1}, 2), 2);
        Assertions.assertEquals(solution.subarraySum(new int[]{1, 2, 3}, 3), 2);
    }

    /**
     * 种花问题
     *
     * @see org.leetcode.solution.Solution_605#canPlaceFlowers
     */
    @Test
    @Order(605)
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
    @Order(643)
    void testSolution_643() {
        System.out.printf(formatSolutionLabel(643, "子数组最大平均数 I"));
        Solution_643 solution = new Solution_643();
        Assertions.assertEquals(solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 12.75);
        Assertions.assertEquals(solution.findMaxAverage(new int[]{5}, 1), 5.00000);
    }

    /**
     * Dota2 参议院
     *
     * @see org.leetcode.solution.Solution_649#predictPartyVictory
     */
    @Test
    @Order(649)
    void testSolution_649() {
        System.out.printf(formatSolutionLabel(649, "Dota2 参议院"));
        Solution_649 solution = new Solution_649();
        Assertions.assertEquals(solution.predictPartyVictory("RD"), "Radiant");
        Assertions.assertEquals(solution.predictPartyVictory("RDD"), "Dire");
    }

    /**
     * 二叉树最大宽度
     *
     * @see org.leetcode.solution.Solution_662#widthOfBinaryTree
     */
    @Test
    @Order(662)
    void testSolution_662() {
        System.out.printf(formatSolutionLabel(662, "二叉树最大宽度"));
        Solution_662 solution = new Solution_662();
        Assertions.assertEquals(solution.widthOfBinaryTree(TreeNode.init(Arrays.asList(1, 3, 2, 5, 3, null, 9))), 4);
        Assertions.assertEquals(solution.widthOfBinaryTree(TreeNode.init(Arrays.asList(1, 3, 2, 5, null, null, 9, 6, null, 7))), 7);
        Assertions.assertEquals(solution.widthOfBinaryTree(TreeNode.init(Arrays.asList(1, 3, 2, 5))), 2);
    }

    /**
     * 二叉搜索树中的搜索
     *
     * @see org.leetcode.solution.Solution_700#searchBST
     */
    @Test
    @Order(700)
    void testSolution_700() {
        System.out.printf(formatSolutionLabel(700, "二叉搜索树中的搜索"));
        Solution_700 solution = new Solution_700();
        TreeNode root = TreeNode.init(Arrays.asList(4, 2, 7, 1, 3));
        Map<Integer, TreeNode> nodeMap = root.toMap();
        Assertions.assertEquals(
                solution.searchBST(root, 2),
                nodeMap.get(2)
        );
        Assertions.assertNull(solution.searchBST(root, 5));
    }

    /**
     * 二分查找
     *
     * @see org.leetcode.solution.Solution_704#search
     */
    @Test
    @Order(704)
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
    @Order(724)
    void testSolution_724() {
        System.out.printf(formatSolutionLabel(724, "寻找数组的中心下标"));

        Solution_724 solution = new Solution_724();
        Assertions.assertEquals(solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}), 3);
        Assertions.assertEquals(solution.pivotIndex(new int[]{1, 2, 3}), -1);
        Assertions.assertEquals(solution.pivotIndex(new int[]{2, 1, -1}), 0);
    }

    /**
     * 行星碰撞
     *
     * @see org.leetcode.solution.Solution_735#asteroidCollision
     */
    @Test
    @Order(735)
    void testSolution_735() {
        System.out.printf(formatSolutionLabel(735, "行星碰撞"));

        Solution_735 solution = new Solution_735();
        Assertions.assertArrayEquals(solution.asteroidCollision(new int[]{5, 10, -5}), new int[]{5, 10});
        Assertions.assertArrayEquals(solution.asteroidCollision(new int[]{8, -8}), new int[]{});
        Assertions.assertArrayEquals(solution.asteroidCollision(new int[]{10, 2, -5}), new int[]{10});
    }

    /**
     * 叶子相似的树
     *
     * @see org.leetcode.solution.Solution_872#leafSimilar
     */
    @Test
    @Order(872)
    void testSolution_872() {
        System.out.printf(formatSolutionLabel(872, "叶子相似的树"));

        Solution_872 solution = new Solution_872();
        Assertions.assertTrue(solution.leafSimilar(
                TreeNode.init(Arrays.asList(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4)),
                TreeNode.init(Arrays.asList(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8))
        ));
        Assertions.assertFalse(solution.leafSimilar(
                TreeNode.init(Arrays.asList(1, 2, 3)),
                TreeNode.init(Arrays.asList(1, 3, 2))
        ));
    }

    /**
     * 最近的请求次数
     *
     * @see org.leetcode.solution.Solution_933
     */
    @Test
    @Order(933)
    void testSolution_933() {
        System.out.printf(formatSolutionLabel(933, "最近的请求次数"));

        Solution_933.RecentCounter recentCounter = new Solution_933.RecentCounter();
        int[] res = new int[]{
                recentCounter.ping(1),
                recentCounter.ping(100),
                recentCounter.ping(3001),
                recentCounter.ping(3002),
        };
        Assertions.assertArrayEquals(res, new int[]{1, 2, 3, 3});
    }

    /**
     * 最大连续1的个数 III
     *
     * @see org.leetcode.solution.Solution_1004#longestOnes
     */
    @Test
    @Order(1004)
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
    @Order(1071)
    void testSolution_1071() {
        System.out.printf(formatSolutionLabel(1071, "字符串的最大公因子"));
        Solution_1071 solution = new Solution_1071();
        Assertions.assertEquals(solution.gcdOfStrings("ABCABC", "ABC"), "ABC");
        Assertions.assertEquals(solution.gcdOfStrings("ABABAB", "ABAB"), "AB");
        Assertions.assertEquals(solution.gcdOfStrings("LEET", "CODE"), "");
    }

    /**
     * 最大层内元素和
     *
     * @see org.leetcode.solution.Solution_1161#maxLevelSum
     */
    @Test
    @Order(1161)
    void testSolution_1161() {
        System.out.printf(formatSolutionLabel(1161, "最大层内元素和"));
        Solution_1161 solution = new Solution_1161();
        Assertions.assertEquals(solution.maxLevelSum(TreeNode.init(Arrays.asList(1, 7, 0, 7, -8, null, null))), 2);
        Assertions.assertEquals(solution.maxLevelSum(TreeNode.init(Arrays.asList(989, null, 10250, 98693, -89388, null, null, null, -32127))), 2);
    }


    /**
     * 独一无二的出现次数
     *
     * @see org.leetcode.solution.Solution_1207#uniqueOccurrences
     */
    @Test
    @Order(1207)
    void testSolution_1207() {
        System.out.printf(formatSolutionLabel(1207, "独一无二的出现次数"));
        Solution_1207 solution = new Solution_1207();
        Assertions.assertTrue(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    /**
     * 二叉树中的最长交错路径
     *
     * @see org.leetcode.solution.Solution_1372#longestZigZag
     */
    @Test
    @Order(1372)
    void testSolution_1372() {
        System.out.printf(formatSolutionLabel(1372, "二叉树中的最长交错路径"));
        Solution_1372 solution = new Solution_1372();
        Assertions.assertEquals(solution.longestZigZag(
                TreeNode.init(Arrays.asList(1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1, null, 1))
        ), 3);
    }

    /**
     * 拥有最多糖果的孩子
     *
     * @see org.leetcode.solution.Solution_1431#kidsWithCandies
     */
    @Test
    @Order(1431)
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
     * 统计二叉树中好节点的数目
     *
     * @see org.leetcode.solution.Solution_1448#goodNodes
     */
    @Test
    @Order(1448)
    void testSolution_1448() {
        System.out.printf(formatSolutionLabel(1448, "统计二叉树中好节点的数目"));
        Solution_1448 solution = new Solution_1448();
        Assertions.assertEquals(solution.goodNodes(TreeNode.init(Arrays.asList(3, 1, 4, 3, null, 1, 5))), 4);
        Assertions.assertEquals(solution.goodNodes(TreeNode.init(Arrays.asList(3, 3, null, 4, 2))), 3);
        Assertions.assertEquals(solution.goodNodes(TreeNode.init(Collections.singletonList(1))), 1);
    }

    /**
     * 定长子串中元音的最大数目
     *
     * @see org.leetcode.solution.Solution_1456#maxVowels
     */
    @Test
    @Order(1456)
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
    @Order(1493)
    void testSolution_1493() {
        System.out.printf(formatSolutionLabel(1493, "删掉一个元素以后全为 1 的最长子数组"));
        Solution_1493 solution = new Solution_1493();
        Assertions.assertEquals(solution.longestSubarray(new int[]{1, 1, 0, 1}), 3);
        Assertions.assertEquals(solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}), 5);
        Assertions.assertEquals(solution.longestSubarray(new int[]{1, 1, 1}), 2);
    }

    /**
     * 确定两个字符串是否接近
     *
     * @see org.leetcode.solution.Solution_1657#closeStrings
     */
    @Test
    @Order(1657)
    void testSolution_1657() {
        System.out.printf(formatSolutionLabel(1657, "确定两个字符串是否接近"));
        Solution_1657 solution = new Solution_1657();
        Assertions.assertTrue(solution.closeStrings("cabbba", "abbccc"));
        Assertions.assertFalse(solution.closeStrings("cabbba", "aabbss"));
    }

    /**
     * K 和数对的最大数目
     *
     * @see org.leetcode.solution.Solution_1679#maxOperations
     */
    @Test
    @Order(1679)
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
    @Order(1732)
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
    @Order(1768)
    void testSolution_1768() {
        System.out.printf(formatSolutionLabel(1768, "交替合并字符串"));
        Solution_1768 solution = new Solution_1768();
        Assertions.assertEquals(solution.mergeAlternately("abc", "pqr"), "apbqcr");
        Assertions.assertEquals(solution.mergeAlternately("ab", "pqrs"), "apbqrs");
        Assertions.assertEquals(solution.mergeAlternately("abcd", "pq"), "apbqcd");
    }

    /**
     * 删除链表的中间节点
     *
     * @see org.leetcode.solution.Solution_2095#deleteMiddle
     */
    @Test
    @Order(2095)
    void testSolution_2095() {
        System.out.printf(formatSolutionLabel(2095, "删除链表的中间节点"));
        Solution_2095 solution = new Solution_2095();
        ListNode input = ListNode.init(Arrays.asList(1, 3, 4, 7, 1, 2, 6));
        Assertions.assertEquals(
                solution.deleteMiddle(input).print(),
                Arrays.asList(1, 3, 4, 1, 2, 6)
        );
    }

    /**
     * 链表最大孪生和
     *
     * @see org.leetcode.solution.Solution_2130#pairSum
     */
    @Test
    @Order(2130)
    void testSolution_2130() {
        System.out.printf(formatSolutionLabel(2130, "链表最大孪生和"));
        Solution_2130 solution = new Solution_2130();
        ListNode input = ListNode.init(Arrays.asList(5, 4, 2, 1));
        Assertions.assertEquals(solution.pairSum1(input), 6);
        Assertions.assertEquals(solution.pairSum(input), 6);
    }

    /**
     * 找出两数组的不同
     *
     * @see org.leetcode.solution.Solution_2215#findDifference
     */
    @Test
    @Order(2215)
    void testSolution_2215() {
        System.out.printf(formatSolutionLabel(2215, "找出两数组的不同"));
        Solution_2215 solution = new Solution_2215();
        List<List<Integer>> res = solution.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        Assertions.assertArrayEquals(res.get(0).toArray(new Integer[0]), new Integer[]{1, 3});
        Assertions.assertArrayEquals(res.get(1).toArray(new Integer[0]), new Integer[]{4, 6});
    }

    /**
     * 相等行列对
     *
     * @see org.leetcode.solution.Solution_2352#equalPairs
     */
    @Test
    @Order(2352)
    void testSolution_2352() {
        System.out.printf(formatSolutionLabel(2352, "相等行列对"));
        Solution_2352 solution = new Solution_2352();
        Assertions.assertEquals(3, solution.equalPairs(
                new int[][]{
                        {3, 1, 2, 2},
                        {1, 4, 4, 5},
                        {2, 4, 2, 2},
                        {2, 4, 2, 2}
                }
        ));
    }

    /**
     * 从字符串中移除星号
     *
     * @see org.leetcode.solution.Solution_2390#removeStars
     */
    @Test
    @Order(2390)
    void testSolution_2390() {
        System.out.printf(formatSolutionLabel(2390, "从字符串中移除星号"));
        Solution_2390 solution = new Solution_2390();
        Assertions.assertEquals("lecoe", solution.removeStars("leet**cod*e"));
        Assertions.assertEquals("", solution.removeStars("erase*****"));
    }
}
