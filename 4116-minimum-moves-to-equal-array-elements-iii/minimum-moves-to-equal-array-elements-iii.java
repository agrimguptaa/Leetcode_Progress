class Solution {
    public int minMoves(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            max = Math.max(num, max);
        }
        return nums.length * max - sum;
    }
}