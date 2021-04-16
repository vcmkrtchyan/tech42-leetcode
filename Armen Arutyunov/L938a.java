public class L938b {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Stack<TreeNode> queue = new Stack<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.pop();
            if (current.val >= low && current.val <= high) {
                sum += current.val;
            }
            if (current.left != null && current.val > low) {
                queue.push(current.left);
            }
            if (current.right != null && current.val < high) {
                queue.push(current.right);
            }
        }
        return sum;
    }
}
