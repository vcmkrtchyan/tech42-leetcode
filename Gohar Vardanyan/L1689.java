public class L1689 {
    public int minPartitions(String n) {
        char[] chars = n.toCharArray();
        int max = chars[0] - 48;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] - 48 > max) {
                max = chars[i] - 48;
                if (max == 9) return max;
            }
        }
        return max;
    }
}