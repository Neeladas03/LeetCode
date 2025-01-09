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
        List<Integer>tree=new ArrayList<>();
        preorder(root,tree);
        return tree;
    }

    private void preorder(TreeNode node,List<Integer>tree){
        if(node==null)return;

        tree.add(node.val);
        preorder(node.left,tree);
        preorder(node.right,tree);
    }
}