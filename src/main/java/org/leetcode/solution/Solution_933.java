package org.leetcode.solution;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/number-of-recent-calls/description/">最近的请求次数</a>
 */
public class Solution_933 {


    public static class RecentCounter {

        private LinkedList<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.addLast(t);
            while (queue.peekFirst() < t - 3000) {
                queue.removeFirst();
            }
            return queue.size();
        }
    }
}
