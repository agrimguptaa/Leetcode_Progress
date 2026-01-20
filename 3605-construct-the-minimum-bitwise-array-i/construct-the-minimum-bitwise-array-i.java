class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for (int i = 0; i < ans.length; i++) {
            int n = nums.get(i);
            if (n == 2) {
                ans[i] = -1;
                continue;
            }
            boolean is = false;
            for (int j = 0; j < n; j++) {
                if ((j | (j + 1)) == n) {
                    ans[i] = j;
                    is = true;
                    break;
                }
            }
            if (!is) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}