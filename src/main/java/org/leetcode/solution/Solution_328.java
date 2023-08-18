package org.leetcode.solution;

import org.common.model.ListNode;

/**
 * <a href="https://leetcode.cn/problems/odd-even-linked-list/description/">奇偶链表</a>
 */
public class Solution_328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        // 当前奇数索引
        ListNode curOdd = head;
        // 当前偶数索引
        ListNode curEven = head.next;
        // 偶数头
        ListNode headEven = head.next;
        while (curEven != null && curEven.next != null) {
            curOdd.next = curEven.next;
            curOdd = curOdd.next;
            curEven.next = curOdd.next;
            curEven = curEven.next;
        }
        curOdd.next = headEven;
        return head;
    }
}
