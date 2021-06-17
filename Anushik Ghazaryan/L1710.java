class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] counts = new int[1001];
        int index = 1000;
        int result = 0;

        for(int i = 0; i < boxTypes.length; i++) {
            counts[boxTypes[i][1]] += boxTypes[i][0] ;
        }

        while(truckSize > 0 && index >= 0) {
            if(counts[index] > 0) {
                if(truckSize - counts[index] < 0) {
                    result += index * truckSize;
                    truckSize = 0;
                }
                else {
                    result += counts[index] * index;
                    truckSize -= counts[index];
                }
            }
            index--;
        }

        return result;
    }
}