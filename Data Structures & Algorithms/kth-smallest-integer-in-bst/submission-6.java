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
    public int kthSmallest(TreeNode root, int k) {

        List<Integer> listo = new ArrayList<>();

        listo = digger(root, listo);
       
        
        return listo.get(k-1);

    }

    public List<Integer> digger(TreeNode root, List<Integer> listy) {
        
        if (root == null) {
            return new ArrayList<>();
        }
       
        digger(root.left, listy);
        listy.add(root.val);
        digger(root.right,listy);

        return listy;

    }
}
