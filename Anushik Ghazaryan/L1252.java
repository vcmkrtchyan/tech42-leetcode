class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;

        for (int[] location : indices) {
            int r = 0;
            int c = 0;

            while (c < n) {
                matrix[location[0]][c++]++;
            }
            while (r < m) {
                matrix[r++][location[1]]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 1) {
                    count++;
                }
            }
        }


//        int[] rows = new int[m];
//        int[] cols = new int[n];
//
//        for (int i = 0; i < indices.length; i++) {
//            rows[indices[i][0]]++;
//            cols[indices[i][1]]++;
//        }
//
//        for (int i = 0; i < rows.length; i++) {
//            for (int j = 0; j < cols.length; j++) {
//                if ((rows[i] + cols[j]) % 2 == 1) {
//                    count++;
//                }
//            }
//        }

        return count;
    }
}