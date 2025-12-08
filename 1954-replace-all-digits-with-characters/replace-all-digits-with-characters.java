class Solution {
    public String replaceDigits(String s) {
        char[] t = s.toCharArray();
        for (int i = 1; i < t.length; i += 2) {
            t[i] = (char) (t[i - 1] + (t[i] - '0'));
        }
        return new String(t);
    }
}