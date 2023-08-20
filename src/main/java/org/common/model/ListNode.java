package org.common.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    /**
     * 格式化输出
     */
    public List<Integer> print() {
        List<Integer> res = new ArrayList<>();
        ListNode tmp = this;
        do {
            res.add(tmp.val);
            tmp = tmp.next;
        } while (tmp != null);

        return res;
    }


    /**
     * 根据 list 初始化
     */
    public static ListNode init(List<Integer> input) {
        ListNode head = new ListNode();

        ListNode cur = head;
        for (int item : input) {
            cur.next = new ListNode(item);
            cur = cur.next;
        }
        return head.next;
    }
}
