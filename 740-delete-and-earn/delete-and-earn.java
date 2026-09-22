class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + num);
            max = Math.max(num, max);
        }
        int take = 0;
        int skip = 0;
        for (int i = 1; i <= max; i++) {
            int newTake = skip + map.getOrDefault(i, 0);
            int newSkip = Math.max(skip, take);
            take = newTake;
            skip = newSkip;
        }
        return Math.max(take, skip);
    }
}