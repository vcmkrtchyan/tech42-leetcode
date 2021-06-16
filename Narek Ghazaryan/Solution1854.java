class Solution {
    public int maximumPopulation(int[][] logs) {
        int count = 0, max = 0, result = 1950;
        int[] diff = new int[111];
        
        for (int[] log : logs) { 
            diff[log[0] - 1950] ++;
            diff[log[1] - 1950] --; 
        }
        
        for (int i = 0; i <= 100; i ++) {
            count += diff[i];
            if (count > max) {
                max = count;
                result = i + 1950;
            }
        }

        return result;

    }
}
