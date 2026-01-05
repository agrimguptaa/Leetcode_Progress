class Solution {
    public long maxMatrixSum(int[][] mat) {
        long ans = 0;
        int min = Integer.MAX_VALUE;
        int neg = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                ans += Math.abs(mat[i][j]);
                if (mat[i][j] < 0) {
                    neg++;
                }
                min = Math.min(min, Math.abs(mat[i][j]));
            }
        }
        if (neg % 2 == 1) {
            ans -= 2 * min;
        }
        return ans;
    }
}