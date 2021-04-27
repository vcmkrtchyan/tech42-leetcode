class Solution {
    public boolean judgeCircle(String moves) {
        if (moves.length()%2 != 0){
            return false;
        }
        
        int horizonal = 0;
        int diagonal = 0;
        
        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'U'){
                diagonal++;
            } else if (moves.charAt(i) == 'D'){
                diagonal--;
            } else if (moves.charAt(i) == 'L'){
                horizonal--;
            } else {
                horizonal++;
            }
        }
       return (horizonal == 0 && diagonal == 0);
    }
}
