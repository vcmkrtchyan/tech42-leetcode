 class Solution {
    public int arraySign(int[] nums) {
       int result = 1;
        
        for(int i =0; i < nums.length; i++){
            
            if(nums[i] == 0){
            result = 0;
            break;}
            
            if(nums[i] < 0)  result++;
            
        }
        
       if(result == 0) {
           result =0;
       } else if (result > 1 && result%2 ==0){
           result = -1;
       } else result = 1;
      
           
        return result;
        
    }
}