public class L1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] sortedBoxes = new int[1001];
        for (int i = 0; i < boxTypes.length; i++) {
            sortedBoxes[boxTypes[i][1]] += boxTypes[i][0];
        }
        int numberOfUnits = 0;
        for (int i = sortedBoxes.length - 1; i >= 0; i--) {
            if (sortedBoxes[i] == 0) continue;
            if (sortedBoxes[i] <= truckSize) {
                numberOfUnits += i * sortedBoxes[i];
                truckSize -= sortedBoxes[i];
            } else {
                numberOfUnits += i * truckSize;
                truckSize -= truckSize;
            }
            if (truckSize == 0)
                break;
        }
        return numberOfUnits;
    }
}
