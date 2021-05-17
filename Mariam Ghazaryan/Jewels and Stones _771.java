class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
       boolean [] isTrue = new boolean[58];
        
        
        for(int i = 0; i < jewels.length(); i++){
            isTrue[(int)(jewels.charAt(i)-65)] = true;
            
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            if( isTrue[(int)(stones.charAt(i)-65) ] )
                count++;
            
        }
        return count;
    }
}