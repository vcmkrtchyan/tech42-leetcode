class Solution {
    public int reverse(int x) {
        
         Long reversedDigit = 0;

            while(x != 0){

                reversedDigit = (reversedDigit * 10) + x%10;
                x = x / 10;

                
            }

            return reversedDigit;
    }
}