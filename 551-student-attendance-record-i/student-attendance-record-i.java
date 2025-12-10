class Solution {
    public boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        int Acount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                Acount++;
            }
        }
        return Acount < 2;
    }
}