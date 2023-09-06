package org.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/restore-ip-addresses/description/">复原 IP 地址</a>
 */
public class Solution_93 {

    private List<String> res;
    private List<String> cur;

    private String s;

    public List<String> restoreIpAddresses(String s) {
        this.s = s;
        res = new ArrayList<>();
        cur = new ArrayList<>();
        dfs(0 , 4);
        return res;
    }

    private void dfs(int start, int seg) {
        if (seg == 0) {
            if (start == s.length()) {
                res.add(String.join(".", cur));
            }
        }
        for (int i = start; i < s.length() && i < start + 3; ++i) {
            // 不能是前导0
            if (s.charAt(start) == '0' && i > start) {
                return;
            }
            int v = Integer.parseInt(s.substring(start, i + 1));
            if (v >= 0 && v <= 255) {
                cur.add(s.substring(start, i + 1));
                dfs(i + 1, seg - 1);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
