class Solution {
    public int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        
        
        for(Integer num : nums) {
            
            if(num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }
            
            if(firstMax == null || firstMax < num) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }else if(secondMax == null || secondMax < num) {
                thirdMax = secondMax;
                secondMax = num;
            }else if(thirdMax == null || thirdMax < num) {
                thirdMax = num;
            }
            
        }
        
        if(thirdMax != null) {
            return thirdMax;
        }
        
        return firstMax;
        
    }
}