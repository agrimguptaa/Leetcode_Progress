class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] sus = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = Math.max(pre[i - 1], nums[i]);
        }
        sus[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sus[i] = Math.min(sus[i + 1], nums[i]);
        }
        nums[n - 1] = pre[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (pre[i] > sus[i + 1]) {
                nums[i] = nums[i + 1];
            } else {
                nums[i] = pre[i];
            }
        }
        return nums;
    }
}