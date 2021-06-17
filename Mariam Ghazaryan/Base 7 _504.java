class Solution {
    public String convertToBase7(int num) {
        int i = 1;
        int total = 0;
        while (num != 0) {
            total += (num % 7) * i;
            i *= 10;
            num /= 7;
        }        
        return Integer.toString(total);
        
    }
}