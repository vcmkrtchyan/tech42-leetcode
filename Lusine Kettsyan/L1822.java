class Solution {
    public int arraySign(int[] nums) {
        int negNumbers = 0;
        for(int num: nums) {
            if(num == 0) {
                return 0;
            }
            if(num < 0) {
                negNumbers += 1;
            }
        }
        
        return negNumbers % 2 == 0 ? 1 : -1;
    }
    
}


class Solution2 {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int num: nums) {
            product *= num;
        }
        
        return signFunc(product);
    }
    
    
    public static int signFunc(int x) {
        if(x > 0) {
            return 1;
        }else if(x < 0) {
            return -1;
        }
        return 0;
    }
}