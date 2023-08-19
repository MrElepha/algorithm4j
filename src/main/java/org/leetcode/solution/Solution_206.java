package org.leetcode.solution;

import org.common.model.ListNode;

/**
 * <a href="https://leetcode.cn/problems/reverse-linked-list/description/">反转链表</a>
 */
public class Solution_206 {

    // 头插法
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

    public ListNode reverseList1(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
