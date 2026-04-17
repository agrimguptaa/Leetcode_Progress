class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int j = 0;
        //1st window
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) {
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[j++] = nums[dq.getFirst()];
        for (int i = k; i < nums.length; i++) {
            //grow
            while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) {
                dq.removeLast();
            }
            dq.add(i);
            //shrink
            if (dq.getFirst() == i - k) {
                dq.removeFirst();
            }
            //ans calculate
            ans[j++] = nums[dq.getFirst()];
        }
        return ans;
    }
}