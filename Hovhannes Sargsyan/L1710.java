class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int [] arr = new int [1001];

        for(int i = 0; i < boxTypes.length; i++){
            arr[boxTypes[i][1]] += boxTypes[i][0];
        }


        int maximum = 0, i = 1000;
        while(i > 0) {
            if(truckSize >= arr[i]) {
                maximum += arr[i] * i;
                truckSize -= arr[i];
                i--;
            }
            else {
                maximum += i * truckSize;
                truckSize = 0;
                break;
            }
        }

        return maximum;
    }
}
