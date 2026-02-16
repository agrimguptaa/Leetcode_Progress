class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int height = 0;
            long a = queries[i][0];
            long b = queries[i][1];
            while (a != b) {
                if (a > b) {
                    a /= 2;
                } else {
                    b /= 2;
                }
                height++;
            }
            ans[i] = height + 1;
        }
        return ans;
    }
}