// use less memory
// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int indexX = 1;
//         int temp;

//         for(int i = 0; i < n; i++) {
//             temp = nums[n+i];
//             for(int k = n+i; k > indexX; k--) {
//                 nums[k] = nums[k-1];
//             }
//             nums[indexX] = temp; 
//             indexX +=2;
//         }
        
//         return nums;     
//     }
// }

//----------------------------------------------
// fast
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[2*n];
        int i = -1;
        
        while(i < 2*n -1) {
            newNums[++i] = nums[i/2];
            newNums[++i] = nums[i/2 + n];
        }
        
        return newNums;
    }
}