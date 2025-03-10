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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[]=new int[1];
        helper(diameter,root);
        return diameter[0];
    }

    public static int helper(int diameter[],TreeNode root){
        if(root==null)return 0;

        int lh=helper(diameter,root.left);
        int rh=helper(diameter,root.right);

        diameter[0]=Math.max(diameter[0],lh+rh);

        return 1+Math.max(lh,rh);


    }
}