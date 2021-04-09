class Solution {
    
   public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int [] resultArr = new int[2];
       
        while (i <= j) {
                int resultTwoNumbers = numbers[i] + numbers[j];
                if (resultTwoNumbers > target) {
                        j -= 1; 
                } else if (resultTwoNumbers < target) {
                        i += 1;
                } else {
                        resultArr[0] = i + 1;
                        resultArr[1] = j + 1;
                        break;
                }
        }
 
        return resultArr;
    }

}
