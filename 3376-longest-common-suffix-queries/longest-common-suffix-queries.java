class Solution {

    class Node {

        HashMap<Character, Node> child;
        int idx;
        int len;

        Node() {
            child = new HashMap<>();
            idx = Integer.MAX_VALUE;
            len = Integer.MAX_VALUE;
        }
    }

    Node root = new Node();

    public void insert(String word, int index) {
        Node curr = root;
        if (word.length() < curr.len || (word.length() == curr.len && index < curr.idx)) {
            curr.len = word.length();
            curr.idx = index;
        }
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            curr.child.putIfAbsent(ch, new Node());
            curr = curr.child.get(ch);
            if (word.length() < curr.len || (word.length() == curr.len && index < curr.idx)) {
                curr.len = word.length();
                curr.idx = index;
            }
        }
    }

    public int search(String word) {
        Node curr = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            if (!curr.child.containsKey(ch)) {
                return curr.idx;
            }
            curr = curr.child.get(ch);
        }
        return curr.idx;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }
        int[] ans = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }
        return ans;
    }
}