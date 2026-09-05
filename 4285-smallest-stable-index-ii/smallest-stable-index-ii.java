class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = -1;
        int curr = 0, prefixMax = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (i == curr) {
                prefixMax = max;
            }
            if (nums[i] < prefixMax - k) {
                curr = i + 1;
            }
        }
        return curr < nums.length ? curr : -1;
    }
}
