
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int index = 0;
        
        int[] result = new int[nums.length];
        
        for(int i = 0; i< nums.length;){
            result[i++] = nums[index++];
            result[i++] = nums[n++];
        }
        return result;   
    }
}
