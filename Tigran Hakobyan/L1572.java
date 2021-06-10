class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0, j = mat.length-1; i<mat.length;){
            sum += mat[i][i];
            sum += mat[i++][j--];
        }
        return (mat.length%2 == 0) ? sum : sum - mat[mat.length/2][mat.length/2];
    }
}