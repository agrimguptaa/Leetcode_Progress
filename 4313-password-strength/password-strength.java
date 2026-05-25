class Solution {
    public int passwordStrength(String password) {
        boolean[] seen = new boolean[128];
        int s = 0;
        for (char ch : password.toCharArray()) {
            if (seen[ch]) {
                continue;
            }
            seen[ch] = true;
            if (ch >= 'a' && ch <= 'z') {
                s += 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                s += 2;
            } else if (ch >= '0' && ch <= '9') {
                s += 3;
            } else {
                s += 5;
            }
        }
        return s;
    }
}