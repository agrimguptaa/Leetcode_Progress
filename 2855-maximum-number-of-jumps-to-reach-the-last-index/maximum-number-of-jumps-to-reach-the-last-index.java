class Solution {
    public int maximumJumps(int[] nums, int target) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (memo[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) <= target) {
                    memo[j] = Math.max(memo[j], memo[i] + 1);
                }
            }
        }
        return memo[nums.length - 1];
    }
}