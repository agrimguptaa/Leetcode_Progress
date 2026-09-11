class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];
        return helper(digits, used, 0);
    }

    private int helper(int[] digits, boolean[] used, int len) {
        if (len == 3) {
            return 1;
        }
        int count = 0;
        boolean[] seen = new boolean[10];
        for (int i = 0; i < digits.length; i++) {
            if (used[i] || (len == 0 && digits[i] == 0) || seen[digits[i]] || (len == 2 && digits[i] % 2 != 0)) {
                continue;
            }
            seen[digits[i]] = true;
            used[i] = true;
            count += helper(digits, used, len + 1);
            used[i] = false;
        }
        return count;
    }
}
