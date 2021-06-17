class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, x = 0;
        for(int i = 0;i < gain.length;i++) {
            x += gain[i];
            if(x > max)
                max = x;
        }
        return max;
    }
}
