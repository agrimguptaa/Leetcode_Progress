class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCnt = 0, oddCnt = 0;
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        return Math.min(oddCnt, evenCnt);
    }
}