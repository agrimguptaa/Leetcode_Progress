class Solution {
    public int arraySign(int[] nums) {
        int s = 1;
        for (int i : nums) {
            if (i == 0) {
                return 0;
            }
            if (i < 0) {
                s = -s;
            }
        }
        return s;
    }
}