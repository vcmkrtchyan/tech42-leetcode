public class L1572 {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i == mat.length - 1 - i) {
                result += mat[i][i];
            } else {
                result += mat[i][i] + mat[i][mat.length - 1 - i];  
            } 
        }
        return result;
    }
}