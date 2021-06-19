public class L1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        int res = 0;

        for (int[] pair : indices) {
            row[pair[0]]++;
            col[pair[1]]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (((row[i] + col[j]) & 1) == 1) {
                    res++;
                }
            }
        }

        return res;

    }
}
