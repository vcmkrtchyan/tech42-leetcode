class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] resault = new int[2];
        
        for(int i = 0; i<numbers.length;i++){
            for(int j = i+1; j<numbers.length;j++){
                if((numbers[i] + numbers[j]) == target){
                    resault[0] = i+1;
                    resault[1] =j+1;
                    break;
                }
            }
        }
     return resault;   
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] resault = new int[2];
        
        for(int i = 1, j = 0; i<numbers.length;i++){
            if(numbers[j] + numbers[i] == target){
                resault[0] = j +1;
                resault[1] = i + 1;
                break;
            }
            if (i == numbers.length-1){
                j ++;
                i = j;
            }
            
        }
     return resault;   
    }
}
