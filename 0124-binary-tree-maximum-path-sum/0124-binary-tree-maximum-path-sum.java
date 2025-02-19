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
    public int maxPathSum(TreeNode root) {
        int maxi[]={Integer.MIN_VALUE};
        findmaxpath(root,maxi);
        return maxi[0];
    }

    public int findmaxpath(TreeNode root,int maxi[]){
        if(root==null){
            return 0;
        }

        int leftsum=Math.max(0,findmaxpath(root.left,maxi));
        int rightsum=Math.max(0,findmaxpath(root.right,maxi));

        maxi[0]=Math.max(maxi[0],leftsum+rightsum+root.val);

        return Math.max(leftsum,rightsum)+root.val;
    }
}