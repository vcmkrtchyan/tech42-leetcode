class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int[] counter = new int[58];
        
        int result = 0;
        
        for (int i = 0; i < jewels.length(); i++){
            counter[jewels.charAt(i) - 65] = 1; 
        }
        
        for (int i = 0; i < stones.length(); i ++){
            result += counter[stones.charAt(i) - 65];
        }
        return result;
    }
}
