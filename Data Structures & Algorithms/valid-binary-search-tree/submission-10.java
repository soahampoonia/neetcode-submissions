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
        if (root == null) {
            return true;
        }

        Boolean left = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        return (left);
    }

    public boolean isBST(TreeNode node, int small, int big) {
        if (node == null) {
            return true;
        }
        if (node.val <= small) {
            return false;
        }
        if (node.val >= big) {
            return false;
        }

        Boolean left = isBST(node.left, small, node.val);
        Boolean right = isBST(node.right, node.val, big);

        return (right && left);
    }
}
