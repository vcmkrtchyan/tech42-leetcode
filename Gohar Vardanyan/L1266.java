public class L1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;     
        for (int i = 0; i < points.length - 1; i++) {
           int x =  points[i][0] - points[i + 1][0];
           int y = points[i][1] - points[i + 1][1]; 
            if(Math.abs(x) > Math.abs(y)) {
                minTime += Math.abs(x);
            } else {
                minTime += Math.abs(y);
            }
        }
        return minTime;
    }
}