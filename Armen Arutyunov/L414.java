
import java.util.Collections;
import java.util.HashSet;

public class L414 {

    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ;
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() >= 3) {
            set.remove(Collections.max(set)); // remove first max
            set.remove(Collections.max(set)); // remove second max
        }
        return Collections.max(set);
    }
}
