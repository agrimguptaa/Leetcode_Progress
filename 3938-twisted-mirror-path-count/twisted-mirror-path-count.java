class Solution {
    public int uniquePaths(int[][] grid) {
        int dp[][][] = new int[grid.length][grid[0].length][2];
        for (int[][] k : dp) {
            for (int[] l : k) {
                Arrays.fill(l, -1);
            }
        }
        return help(grid, 0, 0, 0, dp);
    }

    int help(int[][] grid, int r, int c, int d, int[][][] dp) {
        if (r >= grid.length || c >= grid[0].length) {
            return 0;
        }
        if (r == grid.length - 1 && c == grid[0].length - 1) {
            return 1;
        }
        if (dp[r][c][d] != -1) {
            return dp[r][c][d];
        }
        if (grid[r][c] == 1) {
            if (d == 0) {
                return dp[r][c][d] = help(grid, r + 1, c, 1, dp);
            } else {
                return dp[r][c][d] = help(grid, r, c + 1, 0, dp);
            }
        }
        return dp[r][c][d] = (int) ((help(grid, r + 1, c, 1, dp) + help(grid, r, c + 1, 0, dp)) % 1000000007);
    }
}