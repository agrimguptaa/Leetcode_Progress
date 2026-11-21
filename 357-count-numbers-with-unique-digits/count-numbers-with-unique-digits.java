class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int total = 10, unique = 9;
        for (int i = 2; i <= Math.min(n, 10); i++) {
            unique *= (11 - i);
            total += unique;
        }
        return total;
    }
}