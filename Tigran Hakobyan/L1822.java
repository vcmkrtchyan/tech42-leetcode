class Solution {
    public int arraySign(int[] nums) {
        int negCounter = 0;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                return 0;
            } else if (nums[i] < 0){
                negCounter++;
            }
        }
        
       if (negCounter %2 == 0){
           return 1;
       } else {
           return -1;
       }
    }
}
