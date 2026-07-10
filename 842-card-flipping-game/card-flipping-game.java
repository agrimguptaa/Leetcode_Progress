class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        int[] bad = new int[2001];
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                bad[fronts[i]]++;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < fronts.length; i++) {
            if (bad[fronts[i]] == 0) {
                ans = Math.min(ans, fronts[i]);
            }
            if (bad[backs[i]] == 0) {
                ans = Math.min(ans, backs[i]);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}