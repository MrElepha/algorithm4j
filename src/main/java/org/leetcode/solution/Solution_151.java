package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/reverse-words-in-a-string/">反转字符串中的单词</a>
 */
public class Solution_151 {

    public String reverseWords(String s) {
        // api 写法
        // 除去开头和末尾的空白字符
        // s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        // List<String> wordList = Arrays.asList(s.split("\\s+"));
        // Collections.reverse(wordList);
        // return String.join(" ", wordList);
        char[] arr = s.toCharArray();
        int right = arr.length - 1;
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        while (right >= 0) {
            while (right >= 0 && arr[right] == ' ') {
                --right;
            }
            int left = right;
            while (left > 0 && arr[left - 1] != ' ') {
                --left;
            }
            if (left >= 0 && right >= left) {
                if (!isFirst) {
                    sb.append(" ");
                } else {
                    isFirst = false;
                }
                sb.append(s, left, right + 1);
                right = left - 1;
            }
        }
        return sb.toString();
    }
}
