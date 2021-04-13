class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i1 = 0 , i2 = 0;

        for(int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    i1 = i;
                    i2 = j;
                    return new int[]{i1+1, i2+1};
                }
            }
        }
        return new int[]{i1+1, i2+1};
    }
}
