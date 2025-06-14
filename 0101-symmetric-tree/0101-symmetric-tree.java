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
    public boolean isSymmetric(TreeNode root) {
        TreeNode temp1=null,temp2=null;
        if(root.left!=null)temp1=root.left;
        if(root.right!=null)temp2=root.right;

        return helper(temp1,temp2);
    }

    public boolean helper(TreeNode temp1,TreeNode temp2){
        if(temp1==null && temp2==null)return true;
        if(temp1==null || temp2==null)return false;
        if(temp1.val!=temp2.val)return false;
        return helper(temp1.left,temp2.right)&& helper(temp1.right,temp2.left);
    }
}