class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        boolean[] arr = new boolean[122+1];

        for(int i = 0; i < jewels.length(); i++) {
            arr[jewels.charAt(i)] = true;
        }

        for(int j = 0; j < stones.length(); j++) {
            if(arr[stones.charAt(j)]) {
                count++;
            }
        }

        return count;
    }
}