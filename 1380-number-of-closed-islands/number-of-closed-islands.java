class Solution {
    public int closedIsland(int[][] grid) {
        int ans = 0;
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    if (dfs(grid, i, j)) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    boolean dfs(int[][] grid, int r, int c) {
        // out of bound hai
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return false;
        }
        // closed hai water se
        if (grid[r][c] == 1) {
            return true;
        }
        grid[r][c] = 1;
        // closed island 
        boolean down = dfs(grid, r + 1, c);
        boolean up = dfs(grid, r - 1, c);
        boolean right = dfs(grid, r, c + 1);
        boolean left = dfs(grid, r, c - 1);
        return down && up && right && left;
    }
}