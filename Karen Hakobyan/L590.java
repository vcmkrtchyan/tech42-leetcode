class Solution {
    public List<Integer> postorder(Node root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        postorderTraversal(root, list);
        
        return list;
    }

    public void postorderTraversal(Node node, List<Integer> list) {

        if (node == null) {
            return;
        }

        for (Node child : node.children) {
            postorderTraversal(child, list);
        }

        list.add(node.val);
    }
}