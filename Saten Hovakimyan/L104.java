public class L104 {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(7);
        TreeNode n2 = new TreeNode(15);
        TreeNode n3 = new TreeNode(20, n1, n2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(3,n4,n3);
        System.out.println(maxDepth(n5));
    }
    public static int maxDepth(TreeNode root) {
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
