class Solution {
    public int arrayPairSum(int[] nums) {
        
        int[] maxArray = new int[20001];
		for (int i = 0; i < nums.length; i++) {
			maxArray[nums[i] + 10000]++;
		}
        
		int maximizedSum = 0;
		boolean isMinimum = true;
        
		for (int i = 0; i < maxArray.length; i++) {
			while (maxArray[i] > 0) {
				if (isMinimum) {
					maximizedSum += i - 10000;
				}
				isMinimum = !isMinimum;
				maxArray[i]--;
			}
		}
        
		return maximizedSum;
    }
}