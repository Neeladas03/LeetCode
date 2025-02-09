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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return ans;

        q.add(root);

        while(!q.isEmpty()){
            List<Integer>sublist=new ArrayList<>();
            int levelsize=q.size();

            for(int i=0;i<levelsize;i++){
            TreeNode node=q.poll();
            sublist.add(node.val);

             if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
            }
            ans.add(sublist);
        
        }

        return ans;
    }
}