class Solution {
    public int minPartitions(String n) {
        int num = 0;
        for (int i = 0; i < n.length(); i++){
            if(num < (n.charAt(i) - '0')){
                num = n.charAt(i) - '0';
            }
        }
        return num;
    }
}
