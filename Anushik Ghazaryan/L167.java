class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int second;
        int sub;
        
        while (true) {
            sub = target - numbers[first];
            second = Arrays.binarySearch(numbers,sub);
            if(second > 0) {
                if(second == first)
                    second++;
                return (new int[]{first+1, second+1});
            }                
            first++;
        }
    }
}