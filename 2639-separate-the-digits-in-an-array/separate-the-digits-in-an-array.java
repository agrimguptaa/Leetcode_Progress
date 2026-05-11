class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for (int num : nums) {
            Stack<Integer> st = new Stack<>();
            while (num != 0) {
                st.push(num % 10);
                num /= 10;
            }
            while (!st.isEmpty()) {
                ll.add(st.pop());
            }
        }
        int[] ans = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            ans[i] = ll.get(i);
        }
        return ans;
    }
}