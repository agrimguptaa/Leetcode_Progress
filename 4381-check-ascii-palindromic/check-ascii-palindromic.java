class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < 8; j++) {
                int l = (s.charAt(i) >> j) & 1;
                int r = (s.charAt(n - i - 1) >> (7 - j)) & 1;
                if (l != r) {
                    return false;
                }
            }
        }
        return true;
    }
}