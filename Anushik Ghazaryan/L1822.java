class Solution {
    public int arraySign(int[] nums) {
        return product(nums);
    }
    
    private int product(int[] num) {
        int res = 1;
        
        for(int i : num) {
            if(i == 0)
                return 0;
            if(i > 0)
                res *= 1;
            else
                if(i < 0)
                    res *= -1;
        }
        return res;
    }
}