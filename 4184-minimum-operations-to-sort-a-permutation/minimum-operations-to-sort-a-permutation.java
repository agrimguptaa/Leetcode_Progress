class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (nums[i] != 0) {
            i++;
        }
        boolean along = true, against = true;
        for (int k = 0; k < n; k++) {
            if (nums[(i + k) % n] != k) {
                along = false;
            }
            if (nums[(i - k + n) % n] != k) {
                against = false;
            }
        }
        if (along) {
            return Math.min(i, n - i + 2);
        }
        if (against) {
            return Math.min(i + 2, n - i);
        }
        return -1;
    }
}