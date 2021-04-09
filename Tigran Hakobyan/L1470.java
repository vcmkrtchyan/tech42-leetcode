class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] resault = new int[n*2];
        resault[0] = nums[0];
        int j =0;
        int k = 1;
        
        for(int i = 1; i<nums.length; i++){
            if (i%2 !=0){
                resault[i] = nums[n+(j++)];
            }else{
                resault[i] = nums[k++];
            }
        }
        return resault;
    }
}
