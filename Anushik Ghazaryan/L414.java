class Solution {
    public int thirdMax(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        long pre = Long.MIN_VALUE;
        long prepre = Long.MIN_VALUE;
        
        if(length == 1) {
            return nums[0];
        }
        if(length == 2) {
            return nums[0]>nums[1] ? nums[0] : nums[1];
        }
        
        for(int i = 1; i < length; i++) {
            if(nums[i] > max) {
                prepre = pre;
                pre = max;
                max = nums[i];
            }
            else {
                if(nums[i] > pre && nums[i] != max) {
                    prepre = pre;
                    pre = nums[i];
                }
                else {
                    if(nums[i] > prepre && nums[i] != pre && nums[i] != max) {
                        prepre = nums[i];
                    }
                }
            }
        }
        if(prepre == Long.MIN_VALUE )
            return max;
        return (int)prepre;
    }
}