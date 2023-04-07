import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.solution.Solution_1;
import org.leetcode.solution.Solution_34;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SolutionTest {

    /**
     * 两数之和
     * @see org.leetcode.solution.Solution_1#twoSum
     */
    @Test
    void testSolution_1() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Solution_1 solution = new Solution_1();
        int[] res = solution.twoSum(nums, target);
        System.out.println("two res is:" + String.join(",", Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(", "))));
        Assertions.assertEquals(nums[res[0]] + nums[res[1]], target);
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * @see org.leetcode.solution.Solution_34#searchRange
     */
    @Test
    void testSolution_34() {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        Solution_34 solution = new Solution_34();
        int[] res = solution.searchRange(nums, target);
        Assertions.assertTrue(res[0] == 3 && res[1] == 4);

        target = 6;
        res = solution.searchRange(nums, target);
        Assertions.assertTrue(res[0] == -1 && res[1] == -1);
    }
}
