class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] farr = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                farr[ch - 'A'] = true;
            } else {
                farr[ch - 'a' + 26] = true;
            }
        }
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if (farr[i] && farr[i + 26]) {
                c++;
            }
        }
        return c;
    }
}