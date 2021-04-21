class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int alt = 0;
        
        for(int cur : gain) {
            alt = cur + alt;
            if(alt > max)
                max = alt;
        }      
        return max;
    }
}