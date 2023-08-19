package org.leetcode.solution;

import org.common.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/maximum-twin-sum-of-a-linked-list/">链表最大孪生和</a>
 */
public class Solution_2130 {

    public int pairSum1(ListNode head) {
        ListNode cur = head;
        List<Integer> tmp = new ArrayList<>();
        while (cur != null) {
            tmp.add(cur.val);
            cur = cur.next;
        }
        int r = tmp.size() - 1;
        int l = 0;
        int res = 0;
        while (l < r) {
            res = Math.max(res, tmp.get(l) + tmp.get(r));
            l++;
            r--;
        }
        return res;
    }

    // 官方推荐 快慢指针加反转链表
    public int pairSum(ListNode head) {
        // 快慢指针
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 反转链表 slow 后半链表
        ListNode dummy = new ListNode(-1);
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            cur = tmp;
        }

        int res = 0;
        ListNode l = head;
        ListNode r = dummy.next;
        while (l != null && r != null) {
            res = Math.max(l.val + r.val, res);
            l = l.next;
            r = r.next;
        }
        return res;
    }
}
