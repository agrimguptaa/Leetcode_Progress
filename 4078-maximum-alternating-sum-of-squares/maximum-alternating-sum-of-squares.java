class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] square = new long[n];
        for (int i = 0; i < n; i++) {
            square[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(square);
        long ans = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            ans += square[j];
            ans -= square[i];
            i++;
            j--;
        }
        if (i == j) {
            ans += square[i];
        }
        return ans;
    }
}