class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int [] temp = new int[101];
        
        for(int i = 0; i < logs.length; i++){
            temp[logs[i][0] -1950]++;
            temp[logs[i][1]-1950]--;
        }
        
        int max = temp[0];
        int population = max;
        int year = 0;
        
        for(int i = 1; i < temp.length; i++){
            population += temp[i];
            if(population > max){
                max = population;
                year = i;
                
            }
        }
        
        return year + 1950;
     
    }
}