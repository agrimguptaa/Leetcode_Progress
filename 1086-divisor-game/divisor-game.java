class Solution {
    public boolean divisorGame(int n) {
        return (n & 1) == 0;
        // return n % 2 == 0;
    }
}