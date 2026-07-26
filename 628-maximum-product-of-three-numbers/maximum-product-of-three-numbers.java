class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE, m3 = Integer.MIN_VALUE,
                m4 = Integer.MAX_VALUE, m5 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (m1 <= num) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (m2 <= num) {
                m3 = m2;
                m2 = num;
            } else if (m3 <= num) {
                m3 = num;
            }

            if (m4 >= num) {
                m5 = m4;
                m4 = num;
            } else if (m5 >= num) {
                m5 = num;
            }
        }
        return Math.max(m1 * m2 * m3, m1 * m4 * m5);
    }
}