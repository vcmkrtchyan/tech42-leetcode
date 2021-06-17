class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        
        for (int i = 0; i < n; i++){
            sum += (i == n - i - 1) ? mat[i][i] : mat[i][i] + mat[i][n - i - 1];
        }
        return sum;
    }
}
