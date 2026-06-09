class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return (long) (max - min) * k;
    }
}