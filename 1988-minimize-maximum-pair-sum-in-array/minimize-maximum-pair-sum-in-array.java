class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1, ans = 0;
        while (start <= end) {
            int sum = nums[start] + nums[end];
            if (sum > ans) {
                ans = sum;
            }
            start++;
            end--;
        }
        return ans;
    }
}