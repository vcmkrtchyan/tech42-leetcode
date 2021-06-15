class Solution {
    public int minPartitions(String n) {
        int max = 0;
        char[] arr = n.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i] - '0') 
                max = arr[i] - '0';
        }
        return max;
    }
}
