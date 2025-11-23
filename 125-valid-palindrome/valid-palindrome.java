class Solution {
    public boolean isPalindrome(String s) {
        String s2 = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                s2 += Character.toLowerCase(c);
            }
        }
        int left = 0;
        int right = s2.length() - 1;
        while (left < right) {
            if (s2.charAt(left) != s2.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}