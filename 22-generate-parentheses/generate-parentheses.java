class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generator(n, 0, 0, "", ans);
        return ans;
    }

    public void generator(int n, int o, int c, String ans, List<String> ll) {
        if (o > n || c > o) {
            return;
        }
        if (o == n && c == n) {
            ll.add(ans);
            return;
        }
        generator(n, o + 1, c, ans + "(", ll);
        generator(n, o, c + 1, ans + ")", ll);
    }
}