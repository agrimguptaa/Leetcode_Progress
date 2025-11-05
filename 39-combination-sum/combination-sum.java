class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        Combination(candidates, target, 0, ans, l1, 0);
        return ans;
    }

    public static void Combination(int[] candidates, int target, int balance, List<List<Integer>> ans, List<Integer> l1, int idx) {
        if (balance > target) {
            return;
        }
        if (balance == target) {
            ans.add(new ArrayList<>(l1));
        }
        for (int i = idx; i < candidates.length; i++) {
            l1.add(candidates[i]);
            Combination(candidates, target, balance + candidates[i], ans, l1, i);
            l1.remove((l1.size() - 1));
        }
    }
}