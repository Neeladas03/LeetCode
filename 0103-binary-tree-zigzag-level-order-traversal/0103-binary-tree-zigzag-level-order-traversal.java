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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return ans;
        q.offer(root);
        boolean lefttoright=true;
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer>sublist=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode node=q.poll();
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
                sublist.add(node.val);
            }
            if(!lefttoright){
                       Collections.reverse(sublist);
            }
            lefttoright=!lefttoright;
            ans.add(sublist);
        }
        return ans;
    }
}