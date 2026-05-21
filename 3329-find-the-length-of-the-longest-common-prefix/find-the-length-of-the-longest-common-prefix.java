class Solution {
    class Node {
        Map<Character, Node> child;

        Node() {
            child = new HashMap<>();
        }
    }

    Node root = new Node();

    public void insert(int num) {
        String s = String.valueOf(num);
        Node curr = root;
        for (char ch : s.toCharArray()) {
            if (!curr.child.containsKey(ch)) {
                curr.child.put(ch, new Node());
            }
            curr = curr.child.get(ch);
        }
    }

    public int findLength(int num) {
        String s = String.valueOf(num);
        Node curr = root;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (curr.child.containsKey(ch)) {
                c++;
                curr = curr.child.get(ch);
            } else {
                break;
            }
        }
        return c;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        for (int num : arr1) {
            insert(num);
        }
        int clen = 0;
        for (int num : arr2) {
            int len = findLength(num);
            clen = Math.max(len, clen);
        }
        return clen;
    }
}