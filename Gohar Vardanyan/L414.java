import java.util.Arrays;

public class L414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        int count = 1;
        int thirdMax = nums[nums.length - 1];
        while (i < nums.length && count < 3) {
            if (thirdMax != nums[nums.length - 1 - i]) {
                thirdMax = nums[nums.length - 1 - i];
                count++;
            }
            i++;
        }
        return count == 3 ? thirdMax : nums[nums.length - 1];
    }
}