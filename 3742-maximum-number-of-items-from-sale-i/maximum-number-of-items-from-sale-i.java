class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    b[i]++;
                }
            }
        }
        int[] dp = new int[budget + 1];
        for (int i = 0; i < n; i++) {
            for (int j = budget; j >= items[i][1]; j--) {
                dp[j] = Math.max(dp[j], dp[j - items[i][1]] + 1 + b[i]);
            }
            for (int j = items[i][1]; j <= budget; j++) {
                dp[j] = Math.max(dp[j], dp[j - items[i][1]] + 1);
            }
        }
        int ans = 0;
        for (int i = 0; i <= budget; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}