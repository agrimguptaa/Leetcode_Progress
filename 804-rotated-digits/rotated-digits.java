class Solution {
    public int rotatedDigits(int n) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            int temp = i, flag = 0;
            while (temp != 0) {
                int rem = temp % 10;
                temp /= 10;
                if (rem == 0 || rem == 1 || rem == 8) {
                    continue;
                } else if (rem == 3 || rem == 4 || rem == 7) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                ans++;
            }
        }
        return ans;
    }
}