class Solution {
    public int reverse(int x) {
        int numAbs = Math.abs(x);
        int newNmb = 0;
        
        while(numAbs > 0) {
            if(newNmb*10L > Integer.MAX_VALUE) {
                return 0;
            } 
            newNmb = newNmb * 10 + numAbs%10;
            numAbs /= 10;
        }
      
        return x < 0 ?  newNmb * (-1) : newNmb;
    }
}