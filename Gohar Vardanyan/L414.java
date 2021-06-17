import java.util.Arrays;

public class L414 {
    public int thirdMax(int[] nums) {
         //better version

        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max3 = max2;
                max2 = max;
                max = nums[i];
            }else if(nums[i] < max && nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if(nums[i] < max2 && nums[i] > max3){
                max3 = nums[i];
            }
        }
        if(max3 == Long.MIN_VALUE) {
            return (int) max;
        } else return (int) max3;

        
        /*Arrays.sort(nums);
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
        return count == 3 ? thirdMax : nums[nums.length - 1];*/

       
    }
}