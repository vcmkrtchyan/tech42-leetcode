class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int result = 0;
        int [] arr = new int[58];
        
        for (int i = 0; i < jewels.length(); i++) {
            
            char c = jewels.charAt(i);
            arr[c - 'A'] = 1;
        }
        
        for (int i = 0; i < stones.length(); i++) {
            
            char c = stones.charAt(i);
            result += arr[c - 'A'];
        }
        
        return result;
    }
}