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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode>tree=new LinkedList<>();
        tree.add(root);

        while(!tree.isEmpty()){
            int size=tree.size();
            for(int i=0;i<size;i++){
                TreeNode node=tree.poll();
                if(i==size-1)result.add(node.val);
                if(node.left!=null)tree.add(node.left);
                if(node.right!=null)tree.add(node.right);
            }
        }

        return result;
    }
}