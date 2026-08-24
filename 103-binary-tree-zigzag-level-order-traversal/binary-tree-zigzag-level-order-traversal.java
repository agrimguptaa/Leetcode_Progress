/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int level = 1;
        while (!q.isEmpty()) {
            int s = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                TreeNode node = q.poll();
                temp.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            if (level % 2 == 0) {
                reverse(temp);
            }
            ans.add(temp);
            level++;
        }
        return ans;
    }

    private List<Integer> reverse(List<Integer> ll) {
        int l = 0, r = ll.size() - 1;
        while (l <= r) {
            int t = ll.get(l);
            ll.set(l, ll.get(r));
            ll.set(r, t);
            l++;
            r--;
        }
        return ll;
    }
}