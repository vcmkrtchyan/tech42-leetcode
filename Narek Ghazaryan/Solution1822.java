class Solution {
    public int arraySign(int[] nums) {
        int res = 0;
        int num = 0;

        for(int i : nums) {
            if(i == 0) { 
                return 0;   
            }else if(i < 0){
                num++;
            }
        }

        if(num % 2 != 0){
             res = -1;
        }else {
             res = 1;
        }
        
        return res;

    }
}
