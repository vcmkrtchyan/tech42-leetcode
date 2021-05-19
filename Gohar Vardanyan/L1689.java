public class L1689 {
     public int minPartitions(String n) {
        int length = Math.min(n.length(), 10);
        int max = n.charAt(0) - 48;
        for (int i = 1; i < length; i++) {
            if (n.charAt(i) - 48 > max) {
                max = n.charAt(i) - 48;
            }
        }
        return max;
    }
}