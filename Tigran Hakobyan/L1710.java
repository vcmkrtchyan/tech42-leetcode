class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] bucket = new int[1001];
        
        for (int i = 0; i < boxTypes.length; i++){
            bucket[boxTypes[i][1]] += boxTypes[i][0];
        }
        
        int index = bucket.length-1;
        int result = 0;
        while (index >= 0){
            if (bucket[index] == 0 ){
                index--;
            } else {
                result += truckSize < bucket[index] ? truckSize * index : bucket[index]*index;
                truckSize -= truckSize < bucket[index] ? truckSize : bucket[index];
                
                index--;
                
                if(truckSize == 0){
                    break;
                }
            }
        }
        return result;
    }
}



// slow solution 
// class Solution {
//     public int maximumUnits(int[][] boxTypes, int truckSize) {
//         int[] bucket = new int[1001];
        
//         for (int i = 0; i < boxTypes.length; i++){
//             bucket[boxTypes[i][1]] += boxTypes[i][0];
//         }
        
//         int index = bucket.length-1;
//         int result = 0;
//         while (truckSize > 0 && index >= 0){
//             if (bucket[index] > 0 ){
//                 truckSize--;
//                 result += index;
//                 bucket[index]--;
//             } else {
//                 index--;
//             }
//         }
//         return result;
//     }
// }
