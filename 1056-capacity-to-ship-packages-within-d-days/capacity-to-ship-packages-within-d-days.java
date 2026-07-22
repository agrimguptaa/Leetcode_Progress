class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0], high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, days, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isPossible(int[] weights, int days, int capacity) {
        int curr = 0, used = 1;
        for (int w : weights) {
            if (curr + w <= capacity) {
                curr += w;
            } else {
                curr = w;
                used++;
                if (used > days) {
                    return false;
                }
            }
        }
        return true;
    }
}