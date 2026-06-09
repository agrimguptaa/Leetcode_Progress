class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n, sum = 0, mul = 1;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            mul *= d;
            temp /= 10;
        }
        int ttl = sum + mul;
        return ttl != 0 && n % ttl == 0;
    }
}