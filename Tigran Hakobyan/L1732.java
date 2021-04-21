class Solution {
    public int largestAltitude(int[] gain) {
        int attitude = 0;
        int result = 0;
        
        for (int i = 0; i < gain.length; i++){
            attitude += gain[i];
            if (attitude > result){
                result = attitude;
            }
        }
        return result;        
    }
}
