package org.leetcode.solution;

import org.common.model.ListNode;

/**
 * <a href="https://leetcode.cn/problems/reverse-linked-list/description/">反转链表</a>
 */
public class Solution_206 {

    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            cur = tmp;
        }
        return dummy.next;
    }
}
