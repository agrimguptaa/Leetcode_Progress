class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> ll = new ArrayList<>();
        backtrack(ll, "", n);
        if (k > ll.size()) {
            return "";
        }
        return ll.get(k - 1);
    }

    private void backtrack(ArrayList<String> ll, String curr, int n) {
        if (curr.length() == n) {
            ll.add(curr);
            return;
        }
        char[] letters = { 'a', 'b', 'c' };
        for (char ch : letters) {
            if (curr.length() == 0 || curr.charAt(curr.length() - 1) != ch) {
                backtrack(ll, curr + ch, n);
            }
        }
    }
}