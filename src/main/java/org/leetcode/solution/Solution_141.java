package org.leetcode.solution;

import org.common.model.ListNode;

/**
 * <a href="https://leetcode.cn/problems/linked-list-cycle/description/">环形链表</a>
 */
public class Solution_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
