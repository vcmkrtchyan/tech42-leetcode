class Solution {
   public static int[] twoSum(int[] numbers, int target) {
        int[] indexs = new int[2];
        for(int i = 0;i< numbers.length; i++) {
            for(int j = i + 1;j < numbers.length-i; i++) {
                if(numbers[i]+numbers[j] == target) {
                    indexs[0] = i++;
                    indexs[1] = j++;
                }
            }
        }
        return indexs;
    }
}
