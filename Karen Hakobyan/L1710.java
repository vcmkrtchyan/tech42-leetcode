class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int [] units = new int [1001];
        
        for (int [] boxType : boxTypes) {
            
            units[boxType[1]] += boxType[0];
        }
        
        int count = 0;
        
        for (int i = units.length - 1; i >= 0; i--) {
            
            if (units[i] == 0) {
                continue;
            }
            
            int size = Math.min(units[i], truckSize);
            count += size * i;
            truckSize -= size;
            
            if (truckSize == 0) {
                break;
            } 
        }
        
        return count;
    }
}