class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        boolean hasEven = false;
        for (int n : nums1) {
            if ((n & 1) == 1) {
                minOdd = Math.min(minOdd, n);
            } else {
                hasEven = true;
            }
        }
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }
        for (int n : nums1) {
            if ((n & 1) == 0 && n <= minOdd) {
                return false;
            }
        }
        return true;
    }
}
