class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int i = 0; i < accounts.length; i++) {
            int rSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rSum += accounts[i][j];
            }
            if (rSum > ans) {
                ans = rSum;
            }
        }
        return ans;
    }
}