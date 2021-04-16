class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length ==1){
            return nums[0];
        }else if (nums.length == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++){
            if(nums[i]> first){
                first = nums[i];
            }
        }
        
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < first && nums[i]> second){
                second = nums[i];
            }
        }
        
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < second && nums[i]>= third){
                third = nums[i];
                counter++;
            }
        }
        
        if (third == Integer.MIN_VALUE && counter == 0){
            third = first;
        }
        return third;
    }
}
