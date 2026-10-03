class Solution {
    public int longestValidParentheses(String s) {
        int l = 0, r = 0;
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                max = Math.max(max, 2 * l);
            } else if (r > l) {
                l = 0;
                r = 0;
            }
        }
        l = 0;
        r = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                max = Math.max(max, 2 * l);
            } else if (l > r) {
                l = 0;
                r = 0;
            }
        }
        return max;
    }
}