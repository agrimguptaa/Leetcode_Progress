class Solution {
    public int concatenatedBinary(int n) {
        long res = 0, mod = 1000000007;
        int len = 0;
        for (int i = 1; i <= n; i++) {
            if (Integer.bitCount(i) == 1) {
                len++;
            }
            res = ((res << len) + i) % mod;
        }
        return (int) res;
    }
}