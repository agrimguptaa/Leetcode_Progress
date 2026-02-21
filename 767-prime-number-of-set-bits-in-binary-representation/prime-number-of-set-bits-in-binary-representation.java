class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int temp = i, n = 0;
            while (temp != 0) {
                n += (temp & 1);
                temp >>= 1;
            }
            if (prime(n)) {
                count++;
            }
        }
        return count;
    }

    private boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}