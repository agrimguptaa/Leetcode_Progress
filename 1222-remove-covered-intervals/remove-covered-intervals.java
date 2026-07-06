class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int count = 0, max = 0;
        for (int[] i : intervals) {
            int curr = i[1];
            if (curr > max) {
                count++;
                max = curr;
            }
        }
        return count;
    }
}