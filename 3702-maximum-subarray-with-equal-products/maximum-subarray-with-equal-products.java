class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length, res = 2;
        int prod = 1;
        int start = 0, end = 0;
        while (end < n) {
            while (GCD(prod, nums[end]) > 1) {
                prod /= nums[start];
                start++;
            }
            prod *= nums[end];
            res = Math.max(res, end - start + 1);
            end++;
        }
        return res;
    }

    long GCD(long num1, long num2) {
        while (num2 != 0) {
            long temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}