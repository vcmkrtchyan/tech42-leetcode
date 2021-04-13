public class L104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftNotes = maxDepth(root.left) + 1;
        int rightNotes = maxDepth(root.right) + 1;

        if (leftNotes > rightNotes) {
            return leftNotes;
        } else {
            return rightNotes;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
