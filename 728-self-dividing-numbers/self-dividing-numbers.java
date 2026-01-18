class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int n = i;
            while (n > 0) {
                int digit = n % 10;
                if (digit == 0 || i % digit != 0) {
                    break;
                }
                n /= 10;
            }
            if (n == 0) {
                res.add(i);
            }
        }
        return res;
    }
}