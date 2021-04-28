class Solution {
    public boolean judgeCircle(String moves) {
        int counterVertical = 0;
        int counterHorizantal = 0;
        int i = moves.length() - 1;
        char c;
        
        while(i >= 0) {
            c =  moves.charAt(i--);
            switch (c) {
                case 'L':
                    counterHorizantal++;
                    break;
                case 'R':
                    counterHorizantal--;
                    break;
                case 'U':
                    counterVertical++;
                    break;
                case 'D':
                    counterVertical--;
                    break;
            }      
        }
        if(counterHorizantal == 0 && counterVertical == 0) 
                return true;
        else return false;
    }
}