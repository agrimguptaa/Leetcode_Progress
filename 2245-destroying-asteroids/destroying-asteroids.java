class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long gain = mass;
        for (int i : asteroids) {
            if (gain >= i) {
                gain += i;
            } else {
                return false;
            }
        }
        return true;
    }
}