class Solution {
    public boolean judgeCircle(String moves) {
        
        int leftRight = 0;
        int upDown = 0;
        char [] arr = moves.toCharArray(); 
        
        for(int i = 0; i < moves.length(); i++){
            if(arr[i] == 'L'){
                leftRight++;
            } else if(arr[i] == 'R'){
                leftRight--;
            } else if(arr[i] == 'U'){
                upDown++;
            } else if(arr[i] == 'D'){
                upDown--;
            }
                       
        }
        
        return leftRight == 0 && upDown ==0;
    }
}