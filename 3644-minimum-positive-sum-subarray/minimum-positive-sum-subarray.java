class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int curr = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            curr = 0;
            for (int j = i; j < nums.size(); j++) {
                curr += nums.get(j);
                int len = j - i + 1;
                if (len > r){
                    break;
                }
                if (len >= l && curr > 0) {
                    ans = Math.min(ans, curr);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}