package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/string-compression/">压缩字符串</a>
 */
public class Solution_443 {

    public int compress(char[] chars) {
        int len = chars.length;
        int l = 0;
        int write = 0;
        for (int read = 0; read < len; ++read) {
            if (read == len - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                int num = read - l + 1;
                if (num > 1) {
                    int anchor = write;
                    while (num > 0) {
                        chars[write++] = (char) (num % 10 + '0');
                        num /= 10;
                    }
                    reverse(chars, anchor, write - 1);
                }
                l = read + 1;
            }
        }
        // 将后面字符串置空
//        for (int i = write; i < len; ++i) {
//            chars[i] = ' ';
//        }
//        System.out.println("compressed chars is " + new String(chars));

        return write;
    }

    public void reverse(char[] chars, int l, int r) {
        while (l < r) {
            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            ++l;
            --r;
        }
    }
}
