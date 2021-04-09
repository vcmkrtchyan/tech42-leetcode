class Solution {
    public int[] shuffle(int[] nums, int n) {
        int firstCounter = 0, secondCounter = n;
        
        int[] resault = new int[nums.length];
        
        for(int i = 0; i< nums.length;){
            resault[i++] = nums[firstCounter++];
            resault[i++] = nums[secondCounter++];
        }
        return resault;   
    }
}
