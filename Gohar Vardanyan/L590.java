public class L590 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>(); 
        if(root == null) {
            return list;
        }
        postorderR(root, list);
        return list;     
    }
    
    private void postorderR(Node root, List<Integer> list) {   
            if (root.children != null) {
                for (Node n : root.children) {
                    postorderR(n, list);
                }
            }        
            list.add(root.val);
    }
}