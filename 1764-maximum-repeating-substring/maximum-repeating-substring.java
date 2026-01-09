class Solution {
    public int maxRepeating(String sequence, String word) {
        String s = word;
        int c = 0;
        while (sequence.contains(s)) {
            c++;
            s += word;
        }
        return c;
    }
}