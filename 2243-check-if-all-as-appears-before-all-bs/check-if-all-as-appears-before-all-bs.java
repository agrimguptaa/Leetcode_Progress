class Solution {
    public boolean checkString(String s) {
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                if (b) {
                    return false;
                }
            } else {
                b = true;
            }
        }
        return true;
    }
}