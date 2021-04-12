class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++) {
            for(int j = 0;j<mat.length;j++) {
                if(i==j) sum+=mat[i][j];
            }
        }
        for(int i=mat.length-1;i>=0;i--) {
            for(int j=0;j<mat.length;j++) {
                if(i!=j && i+j==mat.length-1) sum+=mat[i][j];
            }
        }
        return sum;
    }
}
