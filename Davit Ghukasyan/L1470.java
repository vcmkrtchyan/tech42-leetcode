class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int num_mod [] = new int [n*2];
        
        for (int i = 0; i < n ; i++){

            num_mod[2*i] = nums[i];
            num_mod[2*i+1] = nums[i+n];
        }
        return num_mod;
    }
}
