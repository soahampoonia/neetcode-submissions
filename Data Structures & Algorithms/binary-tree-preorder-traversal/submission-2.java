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
    public List<Integer> preorderTraversal(TreeNode root) {
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

        
 listy.add(root.val);
        recurse(root.left, listy);
       
        recurse(root.right, listy);

        return listy;
    }
}
