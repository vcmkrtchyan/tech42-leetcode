class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int increasingCounter = 0;
        int decreasingCounter = numbers.length - 1;
        while(true){
            int i = numbers[increasingCounter];
            int j = numbers[decreasingCounter];
            if (i + j < target) {
                increasingCounter++;
            } else if (i + j > target) {
                decreasingCounter--;
            } else {
                break;
            }
        }
        return new int[] {increasingCounter + 1, decreasingCounter + 1};
    }
}