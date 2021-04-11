public class L167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        Integer[] indexes = twoSum(numbers, target);
        for(Integer i: indexes) {
            System.out.println(i);
        }
    }


    public static Integer[] twoSum(int[] numbers, int target) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        int sum;
        Integer[] arrayOfIndexes = {null, null};

        while(lowIndex < highIndex) {
            sum = numbers[lowIndex] + numbers[highIndex];
            if(sum > target) {
                highIndex--;
            }else if(sum < target) {
                lowIndex++;
            }else {
                arrayOfIndexes[0] = lowIndex + 1;
                arrayOfIndexes[1] = highIndex + 1;
                break;
            }
        }
        return arrayOfIndexes;
    }
}
