public class L1732 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current = current + gain[i];
            if (max < current) {
                max = current;
            }
        }
        return max;
    }
}