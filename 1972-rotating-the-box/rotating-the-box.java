class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length, n = boxGrid[0].length;
        char[][] result = new char[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(result[i], '.');
        }
        for (int i = 0; i < m; i++) {
            int fallOn = n - 1;
            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    result[j][m - 1 - i] = '*';
                    fallOn = j - 1;
                } else if (boxGrid[i][j] == '#') {
                    result[fallOn][m - 1 - i] = '#';
                    fallOn--;
                }
            }
        }
        return result;
    }
}