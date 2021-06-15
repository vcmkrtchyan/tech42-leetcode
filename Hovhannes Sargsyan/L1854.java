public class L1854 {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[2051];
        for (int i = 0; i < logs.length; i++) {
            temp[logs[i][0]]++;
            temp[logs[i][1]]--;
        }
        int max = 0, count = 0, year = 0;

        for (int i = 1950; i < arr.length; i++) {
            count += arr[i];
            if (count > max) {
                max = count;
                year = i;
            }
        }
        return year;
    }
} 
