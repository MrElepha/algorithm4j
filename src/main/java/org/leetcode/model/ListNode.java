package org.leetcode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListNode {

    private int val;
    private ListNode next;

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
            res.add(tmp.getVal());
            tmp = tmp.getNext();
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
            cur = cur.getNext();
        }
        return head.next;
    }
}
