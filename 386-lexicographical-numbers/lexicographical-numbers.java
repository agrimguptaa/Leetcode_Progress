class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> ll = new ArrayList<>();
        Lexicographic(0, n, ll);
        return ll;
    }

    public void Lexicographic(int curr, int n, ArrayList<Integer> ll) {
        if (curr != 0) {
            ll.add(curr);
        }
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            int nxt = curr * 10 + i;
            if (nxt > n) {
                return;
            }
            Lexicographic(nxt, n, ll);
        }
    }
}