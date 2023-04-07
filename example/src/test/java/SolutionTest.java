import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.solution.Solution_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SolutionTest {

    /**
     * 两数之和
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
}
