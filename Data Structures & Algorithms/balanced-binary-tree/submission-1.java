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
    Boolean broken = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return broken;
    }

    public int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        if (Math.abs(right - left) > 1) broken = false;

        return Math.max(right, left) + 1;
    }
}
