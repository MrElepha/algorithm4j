import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.model.ListNode;

import java.util.Arrays;
import java.util.List;

public class ModelTest {

    @Test
    void testListNode() {
        ListNode node = ListNode.init(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> printRes = node.print();
        System.out.printf("list node init res: %s \n", printRes);
        Assertions.assertEquals(printRes.size(), 7);
    }
}
