class Solution {
    List<Integer> postOrderList = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        if (root == null)
            return postOrderList;
        
        for(Node node: root.children) {
            postorder(node);
        }
        
        postOrderList.add(root.val);
        
        return postOrderList;
    }
}