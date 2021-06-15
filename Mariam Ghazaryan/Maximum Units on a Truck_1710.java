class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int [] temp = new int [1002];
       
        for(int i =0; i < boxTypes.length; i++){
            temp[boxTypes[i][1]] += boxTypes[i][0];
        }
        
        int max = 0;
        for(int i = 1000; i > 0; i-- ){
            
            if(truckSize >= temp[i]) {
                max+= i * temp[i];
                truckSize-= temp[i];
            }else{
                max+= i * truckSize;
                truckSize = 0;
                break;
            }
                        
        }
        return max;
       
    }
}