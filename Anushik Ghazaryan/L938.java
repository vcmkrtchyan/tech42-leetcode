class Solution {
    int res = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {        
        if(root == null) return res;
        
        if(root.val <= high && root.val >= low) {
            res += root.val;
            rangeSumBST(root.right, low, high);
            rangeSumBST(root.left, low, high);
            return res;
        }        
        if(root.val <= low) {
            rangeSumBST(root.right, low, high);
            return res;
        }
        if(root.val >= high) {
            rangeSumBST(root.left, low, high);
            return res;
        }
        
        return res;
    }
}