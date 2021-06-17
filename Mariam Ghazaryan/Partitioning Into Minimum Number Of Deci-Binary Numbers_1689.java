class Solution {
    public int minPartitions(String n) {
      // 1  
      char [] m = n.toCharArray();
      int max = 48;
      for(int i = 0; i < m.length; i++){
          if(m[i] > max) max = m[i];
      }  
        return (int) (max - 48);
        
       // 2 
        
    /*int max = 48;
      for(int i = 0; i < n.length(); i++){
          if(n.charAt(i) > max) max = n.charAt(i);
          
      }
        return (int) (max - 48); */
        
        // 3
        
     /* char [] m = n.toCharArray();
        Arrays.sort(m);
        
        return (int) (m[m.length -1] - 48); */
    }
}