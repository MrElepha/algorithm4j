package org.leetcode.solution;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicate-letters/description/">去除重复字母</a>
 */
public class Solution_316 {

    // TODO：太难了，CV（贪心 + 单调栈）
    public String removeDuplicateLetters(String s) {
        // lastIndex[字符] 最后一次出现的下标
        int[] lastIndex = new int[26];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = charArray[i];
            lastIndex[c - 'a'] = i;
        }
        boolean[] visited = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < charArray.length; ++i) {
            char c = charArray[i];
            // 出现过一次
            if (visited[c - 'a']) {
                continue;
            }

            // 弹出条件（找出最小的满足 s[i] > s[i+1] 的下标 i，并去除字符 s[i]，s[i]在后面出现过）
            // c 字典值小于栈顶字典值
            // 栈顶值在后面必须出现过
            while (!stack.isEmpty() && c < stack.peek() && lastIndex[stack.peek() - 'a'] > i) {
                char pop = stack.pop();
                // 弹出之后可以后续继续使用了
                visited[pop - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }
        return sb.toString();
    }
}
