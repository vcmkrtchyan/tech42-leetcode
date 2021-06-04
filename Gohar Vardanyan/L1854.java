public class L1854 {
    public int maximumPopulation(int[][] logs) {
        int[] temp = new int[2051];
        for (int i = 0; i < logs.length; i++) {
            temp[logs[i][0]]++;
            temp[logs[i][1]]--;
        }
        int max = 0;
        int count = 0;
        int year = 0;
        for (int i = 1950; i < temp.length; i++) {
            count += temp[i];
            if (count > max) {
                max = count;
                year = i;
            }
        }
        return year;
    }
}