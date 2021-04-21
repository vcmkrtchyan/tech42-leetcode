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


// class Solution {
//     public List<Integer> postorder(Node root) {  
//         Stack<Node> stack = new Stack<>();
//         List<Integer> list = new ArrayList<>();
        
//         if(root == null) { 
//             return list;
//         }
        
//         stack.push(root);
//         while(!stack.isEmpty()) {
//             Node cur = stack.pop();
//             list.add(cur.val);
//             for(Node child : cur.children) {
//                 stack.push(child);
//             }
//         }
//         Collections.reverse(list);
//         return list;
//     }
// }