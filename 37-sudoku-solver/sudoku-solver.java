class Solution {
    public void solveSudoku(char[][] grid) {
        Print(grid, 0, 0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean Print(char[][] grid, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            return true;
        }
        if (grid[row][col] != '.') {
            return Print(grid, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isSafe(grid, row, col, val)) {
                    grid[row][col] = (char) (val + '0');
                    if (Print(grid, row, col + 1)) {
                        return true;
                    }
                    grid[row][col] = '.';
                }
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] grid, int row, int col, int val) {
        char ch = (char) (val + '0');

        // row
        for (int c = 0; c < grid.length; c++) {
            if (grid[row][c] == ch) {
                return false;
            }
        }

        // column
        for (int r = 0; r < grid.length; r++) {
            if (grid[r][col] == ch) {
                return false;
            }
        }

        row = row - row % 3;
        col = col - col % 3;
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                if (grid[r][c] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}