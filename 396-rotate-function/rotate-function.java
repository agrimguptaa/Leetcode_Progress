class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length, total = 0, rotateVal = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
            rotateVal += i * nums[i];
        }
        int maxVal = rotateVal;
        for (int k = 1; k < n; k++) {
            rotateVal = rotateVal + total - n * nums[n - k];
            maxVal = Math.max(maxVal, rotateVal);
        }
        return maxVal;
    }
}