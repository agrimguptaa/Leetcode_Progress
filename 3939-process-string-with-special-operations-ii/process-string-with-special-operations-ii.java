class Solution {
    public char processStr(String s, long k) {
        long n = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '#':
                    n *= 2;
                    break;
                case '*':
                    if (n > 0) {
                        n--;
                    }
                    break;
                default:
                    if (ch >= 'a' && ch <= 'z') {
                        n++;
                    }
            }
        }
        if (k >= n) {
            return '.';
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            switch (ch) {
                case '%':
                    k = n - 1 - k;
                    break;
                case '#':
                    long h = n / 2;
                    if (k >= h) {
                        k -= h;
                    }
                    n = h;
                    break;
                case '*':
                    n++;
                    break;
                default:
                    if (k == n - 1) {
                        return ch;
                    }
                    n--;
            }
        }
        return '.';
    }
}