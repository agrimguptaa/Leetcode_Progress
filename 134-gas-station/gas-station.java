class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, curr = 0, pos = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            curr += diff;
            if (curr < 0) {
                curr = 0;
                pos = i + 1;
            }
        }
        return total >= 0 ? pos : -1;
    }
}