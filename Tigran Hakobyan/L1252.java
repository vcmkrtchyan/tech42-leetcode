class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        boolean[] rows = new boolean[m];
        boolean[] columns = new boolean[n];
        
        for (int[] element : indices){
            rows[element[0]] ^= true;
            columns[element[1]] ^= true;
        }
        
        for (boolean row : rows){
            for(boolean column : columns){
                if (column ^ row){
                    count++;
                }
            }
        }
        return count;
    }
}
