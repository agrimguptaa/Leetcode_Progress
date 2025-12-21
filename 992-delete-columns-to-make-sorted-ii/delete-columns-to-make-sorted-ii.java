class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length, m = strs[0].length(), ans = 0;
        boolean[] fixed = new boolean[n - 1];
        for (int col = 0; col < m; col++) {
            if (check(strs, fixed, col)) {
                ans++;
            } else {
                for (int i = 0; i < n - 1; i++) {
                    if (!fixed[i] && strs[i].charAt(col) < strs[i + 1].charAt(col)) {
                        fixed[i] = true;
                    }
                }
            }
        }
        return ans;
    }
    public boolean check(String[] strs, boolean[] fixed, int col) {
        for (int i = 0; i < strs.length - 1; i++) {
            if (!fixed[i] && strs[i].charAt(col) > strs[i + 1].charAt(col)) {
                return true;
            }
        }
        return false;
    }
}
