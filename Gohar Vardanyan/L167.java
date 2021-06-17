public class L167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] newArr = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i != j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            }
            if (numbers[i] + numbers[j] == target) {
                newArr[0] = i + 1;
                newArr[1] = j + 1;
                break;
            }
            if (numbers[i] + numbers[j] < target) {
                i++;    
            }
        }
        return newArr;
     }
}