public class L1252 {
    public int oddCells(int m, int n, int[][] indices) { 
        int[] rows = new int[m];
        int[] columns = new int[n];
        for (int i = 0; i < indices.length; i++) {
            rows[indices[i][0]]++;
            columns[indices[i][1]]++;
        }
        int oddCount = 0;
        
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < columns.length; j++) {
                if ((rows[i] + columns[j]) % 2 != 0) {
                    oddCount++;
                }
            }
        }
        return oddCount;
    }
}