class Solution {
    public int arraySign(int[] nums) {
        int negCounter = 2;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                negCounter = 0;
                break;
            } else if (nums[i] < 0){
                negCounter++;
            }
        }
        
        if (negCounter == 0){
            return 0;
        } else if(negCounter%2 == 0){
            negCounter = 1;
        } else {
            negCounter = -1;
        }
        return negCounter;
    }
}
