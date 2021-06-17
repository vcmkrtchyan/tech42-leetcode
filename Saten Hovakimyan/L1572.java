public class L1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            sum += mat[i][i] + mat[i][length - i - 1];
        }
        if(length % 2 == 0) {
            return sum;
        } else return (sum - mat[length/2][length/2]);
    }
}
