class Solution {
    public int thirdMax(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;
        int thirdMax = 0;
        
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if(nums[i] > secondMax && nums[i] != firstMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if(nums[i] > thirdMax && nums[i] != secondMax && nums[i] != firstMax) {
                 thirdMax = nums[i];
            }
        }
        return thirdMax;

    }
    


}
