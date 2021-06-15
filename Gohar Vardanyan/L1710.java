public class L1710 {
   public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = boxTypes[0][1];
        for (int i = 1; i < boxTypes.length; i++) {
            max = Math.max(max,boxTypes[i][1]);
        }
        int[] mat = new int[max + 1];
        for (int i = 0; i < boxTypes.length; i++) {
            mat[boxTypes[i][1]] = mat[boxTypes[i][1]] + boxTypes[i][0];
        }
        int count = 0;
        int total = 0;
        for (int i = mat.length - 1; i >= 0; i--){
           if (mat[i] != 0) {
                if (mat[i] + count < truckSize) {
                    total += mat[i] * i;
                    count += mat[i];
                } else {
                    total += (truckSize - count) * i;
                    break;
                }
            }
        }
        return total;
    }
}