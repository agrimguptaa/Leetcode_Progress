class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        solve(s, getMin(s), res, new HashSet<>());
        return res;
    }

    private int getMin(String s) {
        int open = 0, close = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
        return open + close;
    }

    private void solve(String s, int invalids, List<String> res, HashSet<String> seen) {
        if (!seen.add(s)) {
            return;
        }
        if (invalids == 0) {
            if (getMin(s) == 0) {
                res.add(s);
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }
            char ch = s.charAt(i);
            if (ch != '(' && ch != ')') {
                continue;
            }
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            solve(left + right, invalids - 1, res, seen);
        }
    }
}