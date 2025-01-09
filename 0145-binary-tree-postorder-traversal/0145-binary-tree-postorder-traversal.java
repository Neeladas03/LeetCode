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
        List<Integer>tree=new ArrayList<>();
        postorder(root,tree);
        return tree;
    }

    private void postorder(TreeNode node,List<Integer>tree){
        if(node==null)return;

        postorder(node.left,tree);
        postorder(node.right,tree);
        tree.add(node.val);
    }
}