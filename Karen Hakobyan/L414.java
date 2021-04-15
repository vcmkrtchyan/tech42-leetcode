class Solution {
    public int thirdMax(int[] nums) {
        long firstMaximum = Long.MIN_VALUE;
		long secondMaximum = Long.MIN_VALUE;
		long thirdMaximum = Long.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > firstMaximum) {
				thirdMaximum = secondMaximum;
				secondMaximum = firstMaximum;
				firstMaximum = nums[i];
			} else if (nums[i] > secondMaximum && nums[i] != firstMaximum) {
				thirdMaximum = secondMaximum;
				secondMaximum = nums[i];
			} else if (nums[i] > thirdMaximum && nums[i] != secondMaximum && nums[i] != firstMaximum) {
				thirdMaximum = nums[i];
			}

		}

		if (thirdMaximum == Long.MIN_VALUE || secondMaximum == Long.MIN_VALUE) {

			return (int) firstMaximum;
		}

		return (int) thirdMaximum;
    }
}