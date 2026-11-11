class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        int min = Math.min(need1, need2);
        if ((long) costBoth >= (long) cost1 + cost2) {
            ans = (long) need1 * cost1 + (long) need2 * cost2;
        } else {
            ans += (long) min * costBoth;
            ans += (long) (need1 - min) * Math.min(cost1, costBoth);
            ans += (long) (need2 - min) * Math.min(cost2, costBoth);
        }
        return ans;
    }
}
