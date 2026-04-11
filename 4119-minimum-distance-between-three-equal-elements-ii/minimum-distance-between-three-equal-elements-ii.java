class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
            List<Integer> list = map.get(nums[i]);
            if (list.size() >= 3) {
                ans = Math.min(ans, i - list.get(list.size() - 3));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : 2 * ans;
    }
}