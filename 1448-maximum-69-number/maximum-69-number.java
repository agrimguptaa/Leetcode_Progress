class Solution {
    public int maximum69Number(int num) {
        int ans = num;
        int cng = 0, pos = 1;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 6) {
                cng = 3 * pos;
            }
            num = num / 10;
            pos = pos * 10;
        }
        ans += cng;
        return ans;
    }
}