class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs((hour % 12) * 30.0 - minutes * 5.5);
        return Math.min(angle, 360 - angle);
    }
}