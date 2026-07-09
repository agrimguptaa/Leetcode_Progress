class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> map = new HashMap<>();
        return helper(nums, target, nums.length - 1, map);
    }

    public int helper(int[] nums, int target, int i, HashMap<String, Integer> map) {
        if (i < 0) {
            return target == 0 ? 1 : 0;
        }
        String str = target + "-" + i;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        int plus = helper(nums, target + nums[i], i - 1, map);
        int minus = helper(nums, target - nums[i], i - 1, map);
        map.put(str, plus + minus);
        return plus + minus;
    }
}