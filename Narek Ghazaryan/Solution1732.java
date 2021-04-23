class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int res = 0;

        for (int num : gain) {
          res += num;
          if (res > max){
            max = res;
          }
        }
      
		    return max;
    }
}
