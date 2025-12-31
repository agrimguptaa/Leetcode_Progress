class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int fd = nums[i] / (int) Math.pow(10, (int) Math.log10(nums[i]));
            for (int j = i + 1; j < nums.length; j++) {
                int ld = nums[j] % 10;
                if (gcd(fd, ld) == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}