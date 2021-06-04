class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] populationPerYear = new int[101];
        
        for (int i = 0; i < logs.length; i++) {
            populationPerYear[logs[i][0] - 1950]++;
            populationPerYear[logs[i][1] - 1950]--;
        }
        
        int maxPopulation = populationPerYear[0];
        int maxPopulatedYear = 0;
        
        for (int i = 1; i <= 100; i++) {
            populationPerYear[i] = populationPerYear[i] + populationPerYear[i-1];
            if (populationPerYear[i] > maxPopulation) {
                maxPopulation = populationPerYear[i];
                maxPopulatedYear = i;
            }
        }
        return maxPopulatedYear + 1950;
    }
}
