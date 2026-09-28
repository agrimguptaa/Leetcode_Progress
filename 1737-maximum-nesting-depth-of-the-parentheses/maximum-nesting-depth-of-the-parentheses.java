class Solution {
    public int maxDepth(String s) {
        int ans = 0, cc = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                cc++;
                ans = Math.max(ans, cc);
            } else if (ch == ')') {
                cc--;
            }
        }
        return ans;
    }
}