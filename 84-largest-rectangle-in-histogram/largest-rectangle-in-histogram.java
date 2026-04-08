class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                int r = i;
                int h = heights[st.pop()];
                if (st.isEmpty()) {
                    ans = Math.max(ans, h * r);
                } else {
                    int l = st.peek();
                    ans = Math.max(ans, h * (r - l - 1));
                }
            }
            st.push(i);
        }
        int r = heights.length;
        while (!st.isEmpty()) {
            int h = heights[st.pop()];
            if (st.isEmpty()) {
                ans = Math.max(ans, h * r);
            } else {
                int l = st.peek();
                ans = Math.max(ans, h * (r - l - 1));
            }
        }
        return ans;
    }
}