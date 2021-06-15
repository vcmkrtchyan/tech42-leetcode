class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        getValue(root, list);
        return list;
    }

    public List<Integer> getValue(Node root, List<Integer> list) {
        
        if (root == null) {
            return null;    
        } 
        
        if (root.children != null) {
            for (Node n : root.children) {
                getValue(n, list);
            }    
        }
        
        list.add(root.val);
        return list;
    }
}
