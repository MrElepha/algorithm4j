import org.common.model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.common.model.ListNode;

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

    @Test
    void testTreeNode() {
        List<Integer> input = Arrays.asList(1, null, 2, 3);
        TreeNode root = TreeNode.init(input);
        System.out.printf("tree node init from: %s \n", input);
        Assertions.assertNull(root.left);
        Assertions.assertNull(root.right.right);
    }
}
