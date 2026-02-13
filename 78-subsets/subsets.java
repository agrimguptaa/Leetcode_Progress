class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Sub(nums, ans, ll, 0);
        return ans;
    }

    public void Sub(int[] nums, List<List<Integer>> ans, List<Integer> ll, int idx) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        Sub(nums, ans, ll, idx + 1);
        ll.add(nums[idx]);
        Sub(nums, ans, ll, idx + 1);
        ll.remove(ll.size() - 1);
    }
}