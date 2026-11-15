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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
       if (root == null && subRoot != null) return false;
       if (root == null && subRoot == null) return true;
       if (subRoot == null) return true;

       
       if (isSameTree(root, subRoot)) return true;

       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode a, TreeNode b) {

        if (a == null && b == null) return true;
        if (a == null && b != null) return false;
        if (b == null && a != null) return false;

        if (a.val != b.val) {
            return false;
        }

        boolean left = isSameTree(a.left, b.left);
        boolean right = isSameTree(a.right, b.right);

        if (left && right) {
            return true;
        }
        return false;
    }
}
