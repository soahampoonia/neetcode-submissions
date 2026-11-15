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
    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> list = new ArrayList<>();

        if (root == null) {
            return new ArrayList<>();
        }

        return recurse(root, list);
    }

    public List<Integer> recurse(TreeNode root, List<Integer> listy) {
        if (root == null) {
            return new ArrayList<>();
        }

        
 
        recurse(root.left, listy);
        recurse(root.right, listy);
        listy.add(root.val);
        
        return listy;
    }
}