public class L1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] columns = new int[n];
        int numOfOdd = 0;
        for (int i = 0; i < indices.length; i++) {
            rows[indices[i][0]]++;
            columns[indices[i][1]]++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + columns[j]) % 2 == 1) {
                    numOfOdd++;
                }
            }
        }

        return numOfOdd;
    }
}
