public class L590 {
    List<Integer> listPostorderTraversal = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root != null) {
            for (Node childNode : root.children) {
                postorder(childNode);
            }
            listPostorderTraversal.add(root.val);
        }
        return listPostorderTraversal;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}