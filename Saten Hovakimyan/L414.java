public class L414 {
    public int thirdMax(int[] nums) {
        int max = nums[0];
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        int length = nums.length;
        if (length == 2) {
            return (nums[0] >= nums[1]) ? nums[0] : nums[1];
        }
        if (length == 1) {
            return nums[0];
        }
        for (int i = 1; i < length; i++) {
            if (nums[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            } else {
                if (nums[i] > secondMax && nums[i] != max) {
                    thirdMax = secondMax;
                    secondMax = nums[i];
                } else {
                    if (nums[i] > thirdMax && nums[i] < secondMax) {
                        thirdMax = nums[i];
                    }
                }
            }
        }
        if (thirdMax == Long.MIN_VALUE) {
            return (int) max;
        }
        return (int) thirdMax;
    }
}
