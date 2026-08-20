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
    public boolean isValidBST(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        helper(root, ll);
        for (int i = 1; i < ll.size(); i++) {
            if (ll.get(i - 1) >= ll.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void helper(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        helper(root.left, arr);
        arr.add(root.val);
        helper(root.right, arr);
    }
}