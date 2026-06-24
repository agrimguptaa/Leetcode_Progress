class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] ans = { 1, 0 };
        for (int i = 0; i < s.length(); i++) {
            int w = widths[s.charAt(i) - 'a'];
            if (ans[1] + w > 100) {
                ans[0]++;
                ans[1] = 0;
            }
            ans[1] += w;
        }
        return ans;
    }
}