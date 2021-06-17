class Solution {
    public boolean judgeCircle(String moves) {
        
         int lefts = 0;
         int rights = 0;
         int ups = 0;
         int downs = 0;
        
         for (int i = 0; i < moves.length(); i++) {
             
            if (moves.charAt(i) == 'L' || moves.charAt(i) == 'l') {
                lefts++;
                
            }else if (moves.charAt(i) == 'R' || moves.charAt(i) == 'r'){
                rights++;
                
            }else if (moves.charAt(i) == 'U' || moves.charAt(i) == 'u'){
                ups++;
                
            }else if (moves.charAt(i) == 'D' || moves.charAt(i) == 'd'){
                downs++;
                
            }
             
         }
        
         if (lefts == rights && ups == downs){
             return true;
         }else{
             return false;
         }
        
    }
}
