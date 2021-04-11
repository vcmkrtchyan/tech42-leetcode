public class L1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] newArr = shuffle(nums, 3);
        for (int i : newArr) {
            System.out.println(i);
        }
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[2*n];
        for(int i = 0; i < 2*n; i++) {
            newArr[i] = i % 2 == 0 ? nums[i/2] : nums[n + i/2];
        }
        return newArr;
    }
}
