class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int mul = a * a + b * b;
                int c = (int) Math.sqrt(mul);
                if (c <= n && c * c == mul) {
                    ans++;
                }
            }
        }
        return ans;
    }
}