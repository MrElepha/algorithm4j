package org.leetcode.solution;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/dota2-senate/description/">Dota2 参议院</a>
 */
public class Solution_649 {

    public String predictPartyVictory(String senate) {
        LinkedList<Integer> radiant = new LinkedList<>();
        LinkedList<Integer> dire = new LinkedList<>();

        char[] senateArray = senate.toCharArray();
        int len = senateArray.length;
        for (int i = 0; i < len; ++i) {
            if (senateArray[i] == 'R') {
                radiant.offerLast(i);
            } else {
                dire.offerLast(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            // 分别取队首元素
            int rIndex = radiant.pollFirst();
            int dIndex = dire.pollFirst();

            // 禁用对手投票，将自身加入下一轮投票
            if (rIndex < dIndex) {
                radiant.offerLast(rIndex + len);
            } else {
                dire.offerLast(dIndex + len);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
