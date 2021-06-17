
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L167 {


    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 7, 9, 11};
        int target = 9;
        int[] result = getTwoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int sumCandidate = target - numbers[i];
            if (map.containsKey(sumCandidate)) {
                return new int[]{map.get(sumCandidate) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[0];
    }
}
