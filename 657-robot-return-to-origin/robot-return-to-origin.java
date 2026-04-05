class Solution {
    public boolean judgeCircle(String moves) {
        int u = 0, r = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                u++;
            } else if (ch == 'D') {
                u--;
            } else if (ch == 'R') {
                r++;
            } else {
                r--;
            }
        }
        return u == 0 && r == 0;
    }
}