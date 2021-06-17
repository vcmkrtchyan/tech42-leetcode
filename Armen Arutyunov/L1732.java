class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int highest = 0;
        for (int a : gain) {
            current += a;
            highest = Math.max(current, highest);
        }
        return highest;
    }
}
