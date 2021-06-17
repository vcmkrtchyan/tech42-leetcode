public class L167 {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            int countR = 1 + maxDepth(root.right);
            int countL = 1 + maxDepth(root.left);
            return countR > countL ? countR : countL;
        } else {
            return 0;
        }
    }
}