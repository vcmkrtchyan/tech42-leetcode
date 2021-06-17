class Solution {
    public int diagonalSum(int[][] mat) {
           int result = 0;
           int ln = mat.length - 1;
      
          for(int i = 0; i < mat.length; i++){

            result += mat[i][i];
            if(i == ln) result -= mat[i][ln];       
            result += mat[i][ln--];
       
          }

        return result;
    }
}
