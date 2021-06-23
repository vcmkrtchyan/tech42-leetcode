class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
       int[] counterForEachOfPossibelElementValues = new int[1001];
        
        for (int i = 0; i < arr1.length; i++){
            counterForEachOfPossibelElementValues[arr1[i]] +=1;
        }
        
        int index = 0;
        
        for (int i = 0; i < arr2.length; i++){
            while(counterForEachOfPossibelElementValues[arr2[i]] > 0){
                arr1[index] = arr2[i];
                index++;
                counterForEachOfPossibelElementValues[arr2[i]] -= 1;
            }
        }
        
        for (int i = 0; i < 1001; i++){
            while(counterForEachOfPossibelElementValues[i] > 0){
                arr1[index] = i;
                index++;
                counterForEachOfPossibelElementValues[i] -= 1;
            }
        }
        return arr1;
    }
}
