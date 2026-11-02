class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        long moves = 0;
        while (i < j) {
            moves += nums[i++] - nums[j--];
        }
        return (int) Math.abs(moves);
    }
}