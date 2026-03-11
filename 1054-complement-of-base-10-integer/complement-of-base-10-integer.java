class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int sum = 0, pow = 1;
        while (n != 0) {
            int rem = n % 2;
            rem = (rem == 0) ? 1 : 0;
            sum += rem * pow;
            pow *= 2;
            n /= 2;
        }
        return sum;

        // BIT MANIPULATION
        // int highBit = 1;
        // while (highBit <= n) {
        //     highBit <<= 1;
        // }
        // return (highBit - 1) ^ n;
    }
}