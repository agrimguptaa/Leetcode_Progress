class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int top = 0, bottom = grid.length - 1;
        int left = 0, right = grid[0].length - 1;
        while (top < bottom && left < right) {
            int height = bottom - top;
            int width = right - left;
            int perimeter = 2 * (height + width);
            int rotations = k % perimeter;
            while (rotations-- > 0) {
                int temp = grid[top][left];
                for (int j = left; j < right; j++) {
                    grid[top][j] = grid[top][j + 1];
                }
                for (int i = top; i < bottom; i++) {
                    grid[i][right] = grid[i + 1][right];
                }
                for (int j = right; j > left; j--) {
                    grid[bottom][j] = grid[bottom][j - 1];
                }
                for (int i = bottom; i > top; i--) {
                    grid[i][left] = grid[i - 1][left];
                }
                grid[top + 1][left] = temp;
            }
            top++;
            left++;
            bottom--;
            right--;
        }
        return grid;
    }
}