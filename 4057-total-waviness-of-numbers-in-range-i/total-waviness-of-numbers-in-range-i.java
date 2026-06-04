class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = Math.max(100, num1); i <= num2; i++) {
            int n = i;
            int right = n % 10;
            n /= 10;
            int curr = n % 10;
            n /= 10;
            while (n > 0) {
                int left = n % 10;
                if ((curr > left && curr > right) || (curr < left && curr < right)) {
                    ans++;
                }
                right = curr;
                curr = left;
                n /= 10;
            }
        }
        return ans;
    }
}