class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        
        for(int val: arr1){
            count[val]++;
        }
        
        int index = 0;
        for(int val: arr2){
            while(count[val] > 0){
                arr1[index++] = val;
                count[val]--;
            }
        }
        
        for(int i = 0; i < 1001; i++){
            while(count[i] > 0){
                arr1[index++] = i;
                count[i]--;
            }
        }
        
        return arr1;
    }
}