class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int x = 0, y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            } else {
                y++;
            }
        }
        return Math.abs(x) + y;
    }
}