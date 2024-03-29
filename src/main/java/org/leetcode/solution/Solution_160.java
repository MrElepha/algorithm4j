package org.leetcode.solution;

import org.common.model.ListNode;

/**
 * <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists/description/">相交链表</a>
 */
public class Solution_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if (headA == null || headB == null) {
           return null;
       }
       ListNode p1 = headA;
       ListNode p2 = headB;
       while (p1 != p2) {
           p1 = p1 == null ? headB : p1.next;
           p2 = p2 == null ? headA : p2.next;
       }

       return p1;
    }
}
