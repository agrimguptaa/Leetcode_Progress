class Solution {
    public boolean canJump(int[] nums) {
        int maxPosition = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i > maxPosition) {
                return false;
            }
            if (maxPosition < nums[i] + i) {
                maxPosition = nums[i] + i;
            }
        }
        return true;
    }
}