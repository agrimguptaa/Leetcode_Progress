class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int[][][] dp = new int[grid.length][grid[0].length][k + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                for (int l = 0; l <= k; l++) {
                    dp[i][j][l] = -2;
                }
            }
        }
        return path(grid, k, dp, 0, 0, 0);
    }

    public int path(int[][] grid, int k, int[][][] dp, int i, int j, int cost) {
        if (i == grid.length || j == grid[0].length || cost > k) {
            return -1;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            if (cost + (grid[i][j] == 0 ? 0 : 1) > k) {
                return -1;
            }
            return grid[i][j];
        }
        if (dp[i][j][cost] != -2) {
            return dp[i][j][cost];
        }
        int a = path(grid, k, dp, i + 1, j, cost + (grid[i][j] == 0 ? 0 : 1));
        int b = path(grid, k, dp, i, j + 1, cost + (grid[i][j] == 0 ? 0 : 1));
        if (a == -1 && b == -1) {
            return dp[i][j][cost] = -1;
        }
        return dp[i][j][cost] = Math.max(a, b) + grid[i][j];
    }
}