import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sword2offer.solution.Solution_53_I;

public class Sword2OfferSolutionTest {

    private static String formatSolutionLabel(String solutionNum, String solutionTitle) {
        return String.format("Solution %-7s: %s\n", solutionNum, solutionTitle);
    }

    /**
     * 剑指 Offer 53 - I. 在排序数组中查找数字 I
     * @see org.sword2offer.solution.Solution_53_I#search
     */
    @Test
    void testSolution_53_I() {
        System.out.printf(formatSolutionLabel("53 - I", "在排序数组中查找数字 I"));
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        Solution_53_I solution = new Solution_53_I();
        int res = solution.search(nums, target);
        Assertions.assertEquals(res, 2);

        target = 6;
        res = solution.search(nums, target);
        Assertions.assertEquals(res, 0);
    }
}
