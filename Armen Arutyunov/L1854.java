public class L1854 {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[110];

        for (int[] log : logs) {
            diff[log[0] - 1950]++;
            diff[log[1] - 1950]--;
        }

        int cnt = 0, max = 0, res = 1950;
        for (int i = 0; i <= 100; i++) {
            cnt += diff[i];
            if (cnt > max) {
                max = cnt;
                res = i + 1950;
            }
        }

        return res;

    }
}
