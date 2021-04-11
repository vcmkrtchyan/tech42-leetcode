class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat[0].length;
        int result = 0;  
        
        for(int i = 0; i < size/2; i++) {
            result += mat[i][i] + mat[i][size-1-i] +
                    + mat[size-1-i][i] + mat[size-1 -i][size-1-i];
        }
        if(size % 2 == 1) {
            result += mat[size/2][size/2];
        }
        return result;
    }
}