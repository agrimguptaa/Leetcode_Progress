class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
            }
        }
        if (sorted) {
            return 0;
        }
        if (n == 2) {
            return -1;
        }
        char min = 'z', max = 'a';
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            min = (char) Math.min(ch, min);
            max = (char) Math.max(ch, max);
        }
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }
        if (s.indexOf(min) < n - 1 || s.lastIndexOf(max) > 0) {
            return 2;
        }
        return 3;
    }
}