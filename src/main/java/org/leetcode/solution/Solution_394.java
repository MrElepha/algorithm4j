package org.leetcode.solution;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.cn/problems/decode-string/description/">字符串解码</a>
 */
public class Solution_394 {

    public String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c); // 把所有的字母push进去，除了]
            } else {
                // 1、取出[]内的字符串
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek())) {
                    sb.insert(0, stack.pop());
                }
                // [ ]内的字符串
                String sub = sb.toString();
                // 去除[
                stack.pop();

                // 2、获取倍数数字
                sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    sb.insert(0, stack.pop());
                }
                // 获取倍数
                int count = Integer.parseInt(sb.toString());

                // 3、根据倍数把字母再push回去
                while (count > 0) {
                    for (char ch : sub.toCharArray()) {
                        stack.push(ch);
                    }
                    count--;
                }
            }
        }

        // 把栈里面所有的字母取出来
        StringBuilder rb = new StringBuilder();
        while (!stack.isEmpty()) {
            rb.insert(0, stack.pop());
        }

        return rb.toString();
    }
}
