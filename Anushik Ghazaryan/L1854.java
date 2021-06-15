class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] populList = new int[2051];
        int max = 0;

        for(int[] i : logs) {
            populList[i[0]]++;
            populList[i[1]]--;
        }

        for(int i = 1950; i < 2051; i++) {
            populList[i] += populList[i-1];
            if(populList[i] > populList[max]) {
                max = i;
            }
        }

        return max;

    }
}


//1 ms
//class Solution {
//    public int maximumPopulation(int[][] logs) {
//        int[] populList = new int[101];
//
//        for(int i = 0; i < logs.length; i++) {
//            for(int y = logs[i][0]; y < logs[i][1]; y++) {
//                populList[y-1950]++;
//            }
//        }
//        int max = 0;
//        for(int i = 0; i < 101; i++) {
//            if(populList[i] > populList[max]) {
//                max = i;
//            }
//        }
//
//        return max + 1950;
//
//    }
//}