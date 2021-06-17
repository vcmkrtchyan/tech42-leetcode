class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int [2*n];
        int index = 0;

        for (int i = 0, j = n; i < n && j < 2*n; i++, j++) {
            shuffledArray[index++] = nums [i];
            shuffledArray[index++] = nums [j];
        }
        return shuffledArray;
    }
}