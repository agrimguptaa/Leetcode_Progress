class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int j = y; j < y + k; j++) {
            for (int i = 0; i < k / 2; i++) {
                int temp = grid[x + i][j];
                grid[x + i][j] = grid[x + k - 1 - i][j];
                grid[x + k - 1 - i][j] = temp;
            }
        }
        return grid;
    }
}