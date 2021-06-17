class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;
        int length = gain.length;
        
        for(int item : gain) {
            altitude += item;
            if(altitude > max) {
                max = altitude;
            }
        }
        
        return max;
    }
}