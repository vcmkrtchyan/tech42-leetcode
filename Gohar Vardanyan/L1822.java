public class L1822 {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            if ((nums[i] >> 31 & 1) == 1) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}