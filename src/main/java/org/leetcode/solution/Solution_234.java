package org.leetcode.solution;

import org.common.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/palindrome-linked-list/description/">回文链表</a>
 */
public class Solution_234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        // 将链表的值复制到数组中
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        // 使用双指针判断是否回文
        int l = 0;
        int r = list.size() - 1;
        while (l < r) {
            if (!list.get(l).equals(list.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
