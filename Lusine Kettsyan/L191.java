public class Solution {

    public int hammingWeight(int n) {
        int result = 0;
        
        while(n != 0) {
            result += n%2 & 1;
            n >>>=1;
        }
        
        return result;
    }
}