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
import java.util.ArrayList;

class Solution {
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        int total = 0;
        for (int num : res) {
            total += num;
        }
        return total;
    }

    static void helper(TreeNode root, ArrayList<Integer> res, int currentNum) {
        if (root == null) return;

        currentNum = currentNum * 10 + root.val;

        if (root.left == null && root.right == null) {
            res.add(currentNum);
            return;
        }

        helper(root.left, res, currentNum);
        helper(root.right, res, currentNum);
    }
}