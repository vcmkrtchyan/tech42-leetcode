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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        
        if (root != null){
            if (root.val > high){
                sum += rangeSumBST(root.left, low, high);
            }else if (root.val < low){
                sum += rangeSumBST(root.right, low, high);
            }else {
                sum = rangeSumBST(root.left, low, high) + 
                    rangeSumBST(root.right, low, high) + root.val;
            }
        }
        return sum;        
    }
}
