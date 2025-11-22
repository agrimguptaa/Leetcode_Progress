class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for (int num : nums) {
            int r = num % 3;
            operations += Math.min(r, 3 - r);
        }
        return operations;
    }
}