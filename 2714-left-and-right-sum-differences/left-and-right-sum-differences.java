class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            sum -= curr;
            nums[i] = Math.abs(l - sum);
            l += curr;
        }
        return nums;
    }
}