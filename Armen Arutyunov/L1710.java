import java.util.Arrays;
import java.util.Comparator;

public class L1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int m = boxTypes.length;//Row
        int n = boxTypes[0].length;// column
        int sum = 0;
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        for (int[] boxType : boxTypes) {
            if (truckSize < 0) {
                break;
            }
            if (truckSize >= boxType[0]) {
                sum += boxType[0] * boxType[1];
            } else {
                sum += boxType[1] * truckSize;
            }
            truckSize -= boxType[0];
        }
        return sum;
    }
}
