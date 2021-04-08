public class L167 {
    public static int[] twoSum(int[] numbers, int target) {
        int rightIndex = numbers.length - 1;
        int leftIndex = 0;
        boolean isFound = false;
        int sum;
        int[] resultArray = new int[2];
        while(!isFound) {
            sum = numbers[leftIndex] + numbers[rightIndex];
            if(sum == target) {
                resultArray[0] = leftIndex + 1;
                resultArray[1] = rightIndex + 1;
                isFound = true;
            }
            if(sum > target) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return resultArray;
    }
}