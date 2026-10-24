class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int st = Math.max(helper(arriveAlice), helper(arriveBob));
        int end = Math.min(helper(leaveAlice), helper(leaveBob));
        return Math.max(0, end - st + 1);
    }

    int helper(String s) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int month = Integer.parseInt(s.substring(0, 2));
        int day = Integer.parseInt(s.substring(3));
        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }
        return day;
    }
}