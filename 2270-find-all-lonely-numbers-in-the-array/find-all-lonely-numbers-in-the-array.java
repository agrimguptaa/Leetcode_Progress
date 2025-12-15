class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isLonely = true;
            //x-1
            if (i > 0 && nums[i] == nums[i - 1]) {
                isLonely  = false;
            }
            if (i > 0 && nums[i] == nums[i - 1] + 1) {
                isLonely  = false;
            }

            //x+1
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                isLonely  = false;
            }
            if (i < n - 1 && nums[i] + 1 == nums[i + 1]) {
                isLonely  = false;
            }

            //add
            if (isLonely ) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}