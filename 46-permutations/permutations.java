class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        boolean[] taken = new boolean[nums.length];
        recursion(nums, ans, ll, taken);
        return ans;
    }

    private static void recursion(int[] nums, List<List<Integer>> ans, List<Integer> ll, boolean[] taken) {
        if (ll.size() == nums.length) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (taken[i]) {
                continue;
            }
            taken[i] = true;
            ll.add(nums[i]);
            recursion(nums, ans, ll, taken);
            taken[i] = false;
            ll.remove(ll.size() - 1);
        }
    }
}