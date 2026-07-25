class Solution {
    public int maxProduct(int n) {
        int m1 = 0, m2 = 0;
        for (; n > 0; n /= 10) {
            int d = n % 10;
            if (d > m1) {
                m2 = m1;
                m1 = d;
            } else if (d > m2) {
                m2 = d;
            }
        }
        return m1 * m2;
    }
}