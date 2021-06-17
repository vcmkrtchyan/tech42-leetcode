class Solution {
       public List<Integer> postorder(Node root) {
            List<Integer> list = new ArrayList<>(); 
            if(root == null) 
                return list;
            postorderTraversal(root, list);
            return list;     
        }
    
    private void postorderTraversal(Node root, List<Integer> list) {   
            if (root.children != null) {
                for (Node item : root.children) {
                    postorderTraversal(item, list);
                }
            }        
            list.add(root.val);
    }
}
