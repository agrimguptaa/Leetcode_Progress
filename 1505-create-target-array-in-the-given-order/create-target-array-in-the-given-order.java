class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(index[i], nums[i]);
        }
        int target[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = temp.get(i);
        }
        return target;
    }
}