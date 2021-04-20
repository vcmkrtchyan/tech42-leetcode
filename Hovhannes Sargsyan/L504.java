class Solution {
    public String convertToBase7(int num) {
      int result = 0, x = 1;
        while (num != 0) {
            result+=(num % 7)* x;
            x*=10;
            num/= 7;
        }        
        return Integer.toString(result);
    }
}
