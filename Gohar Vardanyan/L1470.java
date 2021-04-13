public class L1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[2 * n];
        int x = 0;
        int y = n;
        for (int i = 0; i < nums.length; i += 2) {
            newArr[i] = nums[x++];
            newArr[i + 1] = nums[y++];
        }
        return newArr;
    }
}