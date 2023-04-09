import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.solution.Solution_1;
import org.leetcode.solution.Solution_34;
import org.leetcode.solution.Solution_704;

public class LeetCodeSolutionTest {

    private static String formatSolutionLabel(int solutionNum, String solutionTitle) {
        return String.format("Solution_%04d: %s\n", solutionNum, solutionTitle);
    }

    /**
     * 两数之和
     * @see org.leetcode.solution.Solution_1#twoSum
     */
    @Test
    void testSolution_1() {
        System.out.printf(formatSolutionLabel(1, "两数之和"));
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Solution_1 solution = new Solution_1();
        int[] res = solution.twoSum(nums, target);
        Assertions.assertEquals(nums[res[0]] + nums[res[1]], target);
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * @see org.leetcode.solution.Solution_34#searchRange
     */
    @Test
    void testSolution_34() {
        System.out.printf(formatSolutionLabel(34, "在排序数组中查找元素的第一个和最后一个位置"));
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        Solution_34 solution = new Solution_34();
        int[] res = solution.searchRange(nums, target);
        Assertions.assertTrue(res[0] == 3 && res[1] == 4);

        target = 6;
        res = solution.searchRange(nums, target);
        Assertions.assertTrue(res[0] == -1 && res[1] == -1);
    }

    /**
     * 二分查找
     * @see org.leetcode.solution.Solution_704#search
     */
    @Test
    void testSolution_704() {
        System.out.printf(formatSolutionLabel(704, "二分查找"));
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        Solution_704 solution = new Solution_704();
        int res = solution.search(nums, target);
        Assertions.assertEquals(res, 4);

        target = 2;
        res = solution.search(nums, target);
        Assertions.assertEquals(res, -1);
    }
}
