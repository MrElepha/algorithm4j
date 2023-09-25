package org.leetcode.solution;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/lru-cache/description/">LRU 缓存</a>
 */
public class Solution_146 {

    public static class LRUCache extends LinkedHashMap<Integer, Integer> {

        private int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.75F, true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return super.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            super.put(key, value);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }
}
