package org.leetcode.solution;

/**
 * <a href="https://leetcode.cn/problems/number-of-islands/description/">岛屿数量</a>
 */
public class Solution_200 {

    private char[][] input;
    private int xLen;
    private int yLen;

    public int numIslands(char[][] grid) {
        int ans = 0;
        if (grid == null) {
            return ans;
        }
        this.input = grid;
        this.yLen = grid[0].length;
        this.xLen = grid.length;
        for (int x = 0; x < xLen; ++x) {
            for (int y = 0; y < yLen; ++y) {
                if (grid[x][y] == '1') {
                    ans++;
                    dfs(x, y);
                }
            }
        }
        return ans;
    }

    public void dfs(int x, int y) {
        if (x < 0 || x >= xLen || y < 0 || y >= yLen || input[x][y] == '0') {
            return;
        }
        input[x][y] = '0';
        dfs(x - 1, y);
        dfs(x + 1, y);
        dfs(x, y - 1);
        dfs(x, y + 1);
    }
}
