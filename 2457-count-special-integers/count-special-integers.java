class Solution {
    public int countSpecialNumbers(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        int[][][][] dp = new int[len][1 << 10][2][2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < (1 << 10); j++) {
                for (int t = 0; t < 2; t++) {
                    for (int st = 0; st < 2; st++) {
                        dp[i][j][t][st] = -1;
                    }
                }
            }
        }
        return solve(0, 0, 1, 0, s, dp);
    }

    private int solve(int pos, int mask, int tight, int started, String s, int[][][][] dp) {
        if (pos == s.length()) {
            return started == 1 ? 1 : 0;
        }
        if (dp[pos][mask][tight][started] != -1) {
            return dp[pos][mask][tight][started];
        }
        int limit = (tight == 1) ? s.charAt(pos) - '0' : 9;
        int ans = 0;
        for (int digit = 0; digit <= limit; digit++) {
            int newTight = (tight == 1 && digit == limit) ? 1 : 0;
            if (started == 0 && digit == 0) {
                ans += solve(pos + 1, mask, newTight, 0, s, dp);
            } else {
                if ((mask & (1 << digit)) != 0) {
                    continue;
                }
                int newMask = mask | (1 << digit);
                ans += solve(pos + 1, newMask, newTight, 1, s, dp);
            }
        }
        return dp[pos][mask][tight][started] = ans;
    }
}