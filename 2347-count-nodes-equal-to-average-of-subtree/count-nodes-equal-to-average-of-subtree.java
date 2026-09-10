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

    class pair {
        int n;
        int sum;
        int ans;

        pair(int n, int sum, int ans) {
            this.n = n;
            this.sum = sum;
            this.ans = ans;
        }
    }

    public int averageOfSubtree(TreeNode root) {
        return helper(root).ans;
    }

    private pair helper(TreeNode root) {
        if (root == null) {
            return new pair(0, 0, 0);
        }
        pair l = helper(root.left);
        pair r = helper(root.right);
        int n = l.n + r.n + 1;
        int sum = l.sum + r.sum + root.val;
        int ans = l.ans + r.ans;
        if (root.val == sum / n) {
            ans++;
        }
        return new pair(n, sum, ans);
    }
}