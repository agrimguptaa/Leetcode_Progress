class Solution {
    public String[] createGrid(int m, int n) {
        char[][] mat = new char[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(mat[i], '#');
        }
        int c = 0;
        while (c < n) {
            mat[0][c] = '.';
            c++;
        }
        int r = 0;
        while (r < m) {
            mat[r][n - 1] = '.';
            r++;
        }
        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            ans[i] = new String(mat[i]);
        }
        return ans;
    }
}