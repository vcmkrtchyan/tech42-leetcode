class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int res = 0;
        int count = nums.length;
        
        for(int i = 0; i < count; i+=2) {
            res += nums[i];  
        }
        
        return res;        
    }
}