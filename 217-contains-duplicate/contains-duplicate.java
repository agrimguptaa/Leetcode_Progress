class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> have = new HashSet<>();
        for (int num : nums) {
            if (have.contains(num)) {
                return true;
            }
            have.add(num);
        }
        return false;
    }
}