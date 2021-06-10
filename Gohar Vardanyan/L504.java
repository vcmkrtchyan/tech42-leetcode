public class L504 {
     public String convertToBase7(int num) {
        int result = 0;
        int count = 1;
        while (num != 0) {
            result = (num % 7) * count + result;
            num = num / 7;
            count *= 10;
        }
        return String.valueOf(result);

        // long max = Long.MIN_VALUE;
        // long max2 = Long.MIN_VALUE;
        // long max3 = Long.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] > max) {
        //         max3 = max2;
        //         max2 = max;
        //         max = nums[i];
        //     }else if(nums[i] < max && nums[i] > max2) {
        //         max3 = max2;
        //         max2 = nums[i];
        //     } else if(nums[i] < max2 && nums[i] > max3){
        //         max3 = nums[i];
        //     }
        // }
        // if(max3 == Long.MIN_VALUE) {
        //     return (int) max;
        // } else return (int) max3;
     }   
}