class Solution {
    public int[] shuffle(int[] nums, int n) {
        int lengthArr = 2*n;
        int[] newArr = new int[lengthArr];
        
        int i = 0, x = n, j = 0;

        while(j < lengthArr){
            newArr[j++] = nums[i++];
            newArr[j++] = nums[x++];
        }
        
        return newArr;
       
    }
}
