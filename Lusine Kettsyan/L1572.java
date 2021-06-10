public class L1572 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(matrix));
    }

    private static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for(int raw = 0; raw < matrix.length; raw++) {
            int matrixRawLength = matrix[raw].length;
            if(raw != (matrixRawLength - 1 - raw)) {
                sum += matrix[raw][raw] + matrix[raw][(matrixRawLength - 1 - raw)];
            }else {
                sum += matrix[raw][raw];
            }
        }
        return sum;
    }
}
