class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            int sum = 0;
            while (n > 0) {
                sum = sum + (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            if (arr.contains(sum)) {
                return false;
            }
            arr.add(sum);
            n = sum;
        }
    }
}