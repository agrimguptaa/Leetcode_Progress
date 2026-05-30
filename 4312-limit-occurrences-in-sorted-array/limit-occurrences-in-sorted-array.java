class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int lst = 0, c = 0;
        for (int num : nums) {
            if (num == lst) {
                c++;
            } else {
                lst = num;
                c = 1;
            }
            if (c <= k) {
                temp.add(num);
            }
        }
        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}