class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {  
        if(root != null) { 
            for (Node child : root.children) {
                postorder(child);
            }
        list.add(root.val); 
        }
        return list;
    }
}