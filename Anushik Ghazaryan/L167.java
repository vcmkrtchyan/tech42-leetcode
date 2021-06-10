class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int second = numbers.length-1;
        
        while (true) {  
            if((numbers[first] + numbers[second]) == target)
                return(new int[] {first+1, second+1});
            
            if((target - numbers[first]) < numbers[second])
                second--;
            else
            if((target - numbers[second]) > numbers[first])
                first++;
        }
    }
}
