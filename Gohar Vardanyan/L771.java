public class L771 {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] bools = new boolean[123];
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            bools[jewels.charAt(i)] = true;
        }
        for (int i = 0; i < stones.length(); i++) {
            if (bools[stones.charAt(i)]) {
                count++;
            }
        }
        return count;
    }
}