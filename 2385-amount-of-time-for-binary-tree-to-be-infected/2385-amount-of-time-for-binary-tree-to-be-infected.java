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
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode,TreeNode>parentMap=new HashMap<>();
        TreeNode targetNode=buildparentMap(root,start,parentMap);

        Queue<TreeNode>q=new LinkedList<>();
        Set<TreeNode>seen=new HashSet<>();
        int time=-1;
        
        q.add(targetNode);
        seen.add(targetNode);

        while(!q.isEmpty()){
            int size=q.size();
            time++;
            for(int i=0;i<size;i++){
              TreeNode curr=q.poll();
              if(curr.left!=null &&seen.add(curr.left)){
                q.add(curr.left);
              }

              if(curr.right!=null && seen.add(curr.right)){
                q.add(curr.right);
              }

              TreeNode parent=parentMap.get(curr);
              if(parent!=null && seen.add(parent)){
                q.add(parent);
              }
            }
        }
        return time;
    }

    public static TreeNode buildparentMap(TreeNode root,int target,Map<TreeNode,TreeNode>parentMap){
            Queue<TreeNode>q=new LinkedList<>();
            q.add(root);
            TreeNode targetNode=null;
            while(!q.isEmpty()){
                TreeNode curr=q.poll();

                if(curr.val==target){
                    targetNode=curr;
                }

                if(curr.left!=null){
                    parentMap.put(curr.left,curr);
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    parentMap.put(curr.right,curr);
                    q.add(curr.right);
                }
            }
            return targetNode;
    }
}