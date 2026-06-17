class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char ans = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int samay = Math.abs(releaseTimes[i] - releaseTimes[i - 1]);
            char ch = keysPressed.charAt(i);
            if (samay > max) {
                max = samay;
                ans = ch;
            } else if (samay == max && ans < ch) {
                ans = ch;
            }
        }
        return ans;
    }
}