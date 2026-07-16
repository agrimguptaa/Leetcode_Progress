class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int mx = nums[0];
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            nums[i] = gcd(mx, nums[i]);
        }
        Arrays.sort(nums);
        int i = 0, j = n - 1;
        long ans = 0;
        while (i < j) {
            ans += gcd(nums[i++], nums[j--]);
        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}